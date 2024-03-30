package com.senai.m1s9exerciciosemanal.controllers;

import com.senai.m1s9exerciciosemanal.entities.BibliotecarioEntity;
import com.senai.m1s9exerciciosemanal.services.BibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/bibliotecarios")
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;

    @PostMapping
    public BibliotecarioEntity adicionarBibliotecarios(@RequestBody BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioService.salvarBibliotecario(bibliotecarioEntity);
    }

    @GetMapping
    public List<BibliotecarioEntity> retornarBibliotecarios() {
        return bibliotecarioService.listarBibliotecarios();
    }

    @DeleteMapping
    public String apagarBibliotecario(@RequestParam("id") Long id) {
        bibliotecarioService.apagarBibliotecario(id);
        return "Bibliotecario apagado";
    }

    @PutMapping
    public BibliotecarioEntity atualizarBibliotecario(@RequestBody BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioService.atualizarBibliotecario(bibliotecarioEntity);
    }
}
