package com.buap.enfermeras;

import com.buap.especialidad.Especialidad;
import jakarta.validation.constraints.NotBlank;

public record DatosRegistroEnfermera(
    @NotBlank
    String nombre,
    @NotBlank
    String apellidoPaterno,
    @NotBlank
    String apellidoMaterno,
    @NotBlank
    String telefono,
    @NotBlank
    Especialidad especialidad
) {
}
