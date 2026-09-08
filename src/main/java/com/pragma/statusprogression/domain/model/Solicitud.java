package com.pragma.statusprogression.domain.model;

import java.time.LocalDateTime;

public record Solicitud(Long id, String estado, LocalDateTime fechaSolicitud) {}