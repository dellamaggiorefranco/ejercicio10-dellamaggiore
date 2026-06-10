package com.programacion4.ejercicio10.controllers;

import org.springframework.web.bind.annotation.*;
import com.programacion4.ejercicio10.models.Tarea;
import com.programacion4.ejercicio10.repo.TareaRepository;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    private final TareaRepository tareaRepository;

    public TareaController(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    @PostMapping
    public Tarea guardar(@RequestBody Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @GetMapping
    public Iterable<Tarea> listar() {
        return tareaRepository.findAll();
    }
}
