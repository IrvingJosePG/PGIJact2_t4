package com.nextvoto.actividad1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentificacionController {

    @GetMapping("/mi-nombre")
    public String obtenerNombre() {
        return "Instancia de Irvin - Proyecto NextVoto";
    }
}