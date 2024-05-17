package com.buap.enfermeras;

import com.buap.especialidad.Especialidad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "enfermeras")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode( of = "id")
public class Enfermera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre, apellidoPaterno, apellidoMaterno;
    private String telefono;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;

    public Enfermera(DatosRegistroEnfermera datosRegistroEnfermera){
        this.nombre = datosRegistroEnfermera.nombre();
        this.apellidoPaterno = datosRegistroEnfermera.apellidoPaterno();
        this.apellidoMaterno = datosRegistroEnfermera.apellidoMaterno();
        this.telefono = datosRegistroEnfermera.telefono();
        this.especialidad = datosRegistroEnfermera.especialidad();
    }

}
