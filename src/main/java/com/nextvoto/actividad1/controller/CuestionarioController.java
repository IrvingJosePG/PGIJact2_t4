package com.nextvoto.actividad1.controller;

import com.nextvoto.actividad1.dto.CuestionarioDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/cuestionarios")
public class CuestionarioController {

    @Value("${app.nombre}")
    private String nombreApp;

    private List<CuestionarioDTO> lista = new ArrayList<>(List.of(
        new CuestionarioDTO(1L, "Evaluación Diagnóstica: Matemáticas I", "Matemáticas", 25),
        new CuestionarioDTO(2L, "Encuesta Estudiantil: Programación", "Programación Web", 10),
        new CuestionarioDTO(3L, "Examen Parcial: Redes de Datos", "Redes", 45)
    ));

    // a) Lista con Model, th:each y @Value
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("appName", nombreApp);
        model.addAttribute("cuestionarios", lista);
        return "listado";
    }

    // Ejemplo con @RequestParam (filtrar por materia)
    @GetMapping("/filtrar")
    public String filtrar(@RequestParam(name = "materia", defaultValue = "") String materia, Model model) {
        List<CuestionarioDTO> filtrados = lista.stream()
                .filter(c -> c.getMateria().equalsIgnoreCase(materia))
                .collect(Collectors.toList());
        model.addAttribute("appName", nombreApp);
        model.addAttribute("cuestionarios", filtrados);
        return "listado";
    }

    // Ejemplo con @PathVariable (detalle por ID)
    @GetMapping("/detalle/{id}")
    public String detalle(@PathVariable("id") Long id, Model model) {
        CuestionarioDTO item = lista.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
        model.addAttribute("appName", nombreApp);
        model.addAttribute("cuestionario", item);
        return "detalle";
    }

    // b) Formulario con @ModelAttribute
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cuestionario", new CuestionarioDTO());
        return "formulario";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute("cuestionario") CuestionarioDTO dto) {
        dto.setId((long) (lista.size() + 1));
        lista.add(dto);
        return "redirect:/cuestionarios";
    }
}