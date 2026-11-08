package com.nextvoto.actividad1;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatosController {


    @GetMapping("/mis-materias")
    public List<String> obtenerMaterias() {
        return Arrays.asList("Programación Web", "Bases de Datos", "Ingeniería de Software");
    }

    // ENDPOINT 3: Regresa un tipo de respuesta diferente (un número en este caso)
    @GetMapping("/mi-semestre")
    public Integer obtenerSemestre() {
        return 6; // Puedes cambiarlo por tu semestre real
    }
}