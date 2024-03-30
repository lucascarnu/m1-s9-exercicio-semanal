package com.senai.m1s9exerciciosemanal.controllers;

import com.senai.m1s9exerciciosemanal.entities.VisitanteEntity;
import com.senai.m1s9exerciciosemanal.services.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/visitantes")
public class VisitanteController {

    private final VisitanteService visitanteService;

    @PostMapping
    public VisitanteEntity adicionarVisitantes(@RequestBody VisitanteEntity visitanteEntity) {
        return visitanteService.salvarVisitante(visitanteEntity);
    }

    @GetMapping
    public List<VisitanteEntity> retornarVisitantes() {
        return visitanteService.listarVisitantes();
    }

    @DeleteMapping
    public String apagarVisitante(@RequestParam("id") Long id) {
        visitanteService.apagarVisitante(id);
        return "Visitante apagado";
    }

    @PutMapping
    public VisitanteEntity atualizarVisitante(@RequestBody VisitanteEntity visitanteEntity) {
        return visitanteService.atualizarVisitante(visitanteEntity);
    }
}
