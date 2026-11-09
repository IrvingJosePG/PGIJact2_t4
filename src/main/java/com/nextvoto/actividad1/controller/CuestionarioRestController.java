package com.nextvoto.actividad1.controller;

import com.nextvoto.actividad1.dto.CuestionarioDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cuestionarios")
public class CuestionarioRestController {

    @PostMapping
    public CuestionarioDTO crear(@RequestBody CuestionarioDTO dto) {
        dto.setId(100L); // Simulamos que la base de datos le asignó un ID
        return dto; // Devolvemos el mismo objeto en formato JSON
    }
}