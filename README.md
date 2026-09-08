# Simulación de Progresión de Estado en Pipeline

El objetivo es simular la progresión de estado de una solicitud a través de un pipeline de procesamiento en una plataforma de banca digital. Los actores involucrados son el originador de créditos, el motor antifraude, el buró de riesgos y el core bancario. La solicitud debe transitar por los estados 'pendiente', 'evaluación', 'aprobado' y'rechazado'. Se deben manejar umbrales numéricos como 1 500 solicitudes/segundo en hora pico y latencia máxima de 2 segundos en la respuesta del buró. La razón de negocio es asegurar que las solicitudes se procesen de manera eficiente y segura.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Status Progression Test |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 4 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Definición de Estados y Transiciones

**Objetivo:** Definir los estados y las transiciones posibles de una solicitud en el pipeline.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Identificar los estados 'pendiente', 'evaluación', 'aprobado' y'rechazado'.
- Establecer las transiciones válidas entre estos estados.
- Documentar los criterios de aceptación para cada transición.

**Entregable:** Diagrama de estados y transiciones con criterios de aceptación.

<details>
<summary>Pistas de conocimiento</summary>

- Considera las restricciones de negocio y los umbrales numéricos.
- Piensa en los posibles modos de falla y cómo manejarlos.

</details>

### Fase 2: Simulación de Flujo de Solicitudes

**Objetivo:** Simular el flujo de solicitudes a través del pipeline, manejando los estados definidos.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Crear un simulador que genere solicitudes y las haga transitar por los estados definidos.
- Implementar la lógica para manejar las transiciones y los criterios de aceptación.
- Asegurar que el simulador respete los umbrales numéricos y latencias máximas.

**Entregable:** Simulador de flujo de solicitudes con lógica de transición y manejo de umbrales.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza datos de ejemplo para probar las transiciones.
- Considera los modos de falla y cómo recuperarse de ellos.

</details>

### Fase 3: Evaluación de Rendimiento y Optimización

**Objetivo:** Evaluar el rendimiento del simulador y optimizar su funcionamiento.

**Tiempo estimado:** 1 hora

**Instrucciones:**

- Medir el rendimiento del simulador en términos de solicitudes por segundo y latencia.
- Identificar cuellos de botella y proponer optimizaciones.
- Ajustar el simulador para cumplir con los umbrales numéricos y latencias máximas.

**Entregable:** Reporte de rendimiento con propuestas de optimización.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza herramientas de profiling para identificar cuellos de botella.
- Considera trade-offs entre rendimiento y complejidad.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los estados y transiciones en el contexto del pipeline de procesamiento?
- **paraQueSirve**: ¿Para qué sirven los criterios de aceptación en las transiciones de estado?
- **comoSeUsa**: ¿Cómo se utiliza el simulador para manejar el flujo de solicitudes?
- **erroresComunes**: ¿Cuáles son los errores comunes al simular el flujo de solicitudes y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones implica la optimización del rendimiento del simulador?

## Criterios de Evaluacion

- Definir estados y transiciones válidas en el pipeline.
- Simular el flujo de solicitudes respetando umbrales numéricos y latencias máximas.
- Evaluar y optimizar el rendimiento del simulador.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
