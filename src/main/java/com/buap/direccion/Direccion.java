package com.buap.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {

    private String calle, municipio, localidad, estado, codigoPostal;

    public Direccion(DatosDireccion direccion){
        this.calle = direccion.calle();
        this.municipio = direccion.municipio();
        this.localidad = direccion.localidad();
        this.estado = direccion.estado();
        this.codigoPostal = direccion.codigoPostol();
    }

}
