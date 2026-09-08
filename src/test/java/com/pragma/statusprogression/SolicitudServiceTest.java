package com.pragma.statusprogression;

import com.pragma.statusprogression.domain.model.Solicitud;
import com.pragma.statusprogression.domain.service.SolicitudService;
import com.pragma.statusprogression.infrastructure.adapter.SolicitudRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
class SolicitudServiceTest {

    @Autowired
    private SolicitudService solicitudService;

    @MockBean
    private SolicitudRepository solicitudRepository;

    @Test
    void getAllSolicitudes() {
        Solicitud solicitud1 = new Solicitud(1L, "pendiente", LocalDateTime.now());
        Solicitud solicitud2 = new Solicitud(2L, "evaluación", LocalDateTime.now());
        when(solicitudRepository.findAll()).thenReturn(List.of(solicitud1, solicitud2));

        List<Solicitud> solicitudes = solicitudService.getAllSolicitudes();

        assertThat(solicitudes).hasSize(2);
        assertThat(solicitudes).contains(solicitud1, solicitud2);
    }

    @Test
    void createSolicitud() {
        Solicitud solicitud = new Solicitud(null, "aprobado", LocalDateTime.now());
        when(solicitudRepository.save(solicitud)).thenReturn(solicitud);

        Solicitud savedSolicitud = solicitudService.createSolicitud(solicitud);

        assertThat(savedSolicitud).isEqualTo(solicitud);
    }
}