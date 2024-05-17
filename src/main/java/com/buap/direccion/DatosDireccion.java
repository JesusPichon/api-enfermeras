package com.buap.direccion;

import jakarta.validation.constraints.NotBlank;

public record DatosDireccion(

    @NotBlank
    String calle,

    @NotBlank
    String municipio,

    @NotBlank
    String localidad,

    @NotBlank
    String estado,

    @NotBlank
    String codigoPostol){
}
