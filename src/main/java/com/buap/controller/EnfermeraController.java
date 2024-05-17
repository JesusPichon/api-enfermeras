package com.buap.controller;

import com.buap.enfermeras.DatosRegistroEnfermera;
import com.buap.enfermeras.Enfermera;
import com.buap.enfermeras.EnfermeraRopository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enfermeras")
public class EnfermeraController {

    private EnfermeraRopository enfermeraRopository;

    public EnfermeraController(EnfermeraRopository enfermeraRopository){
        this.enfermeraRopository = enfermeraRopository;
    }

    @PostMapping
    public void registrarEnfermera(@RequestBody DatosRegistroEnfermera datosRegistroEnfermera){
        enfermeraRopository.save(new Enfermera(datosRegistroEnfermera));
    }

    @GetMapping
    public List<Enfermera> obtenerListaEnfermeras(){
        return enfermeraRopository.findAll();
    }
}
