package com.senai.m1s9exerciciosemanal.controllers;

import com.senai.m1s9exerciciosemanal.entities.LivroEntity;
import com.senai.m1s9exerciciosemanal.services.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    @PostMapping
    public LivroEntity adicionarLivros(@RequestBody LivroEntity livroEntity) {
        return livroService.salvarLivro(livroEntity);
    }

    @GetMapping
    public List<LivroEntity> retornarLivros() {
        return livroService.listarLivros();
    }

    @DeleteMapping
    public String apagarLivro(@RequestParam("id") Long id) {
        livroService.apagarLivro(id);
        return "Livro apagado";
    }

    @PutMapping
    public LivroEntity atualizarLivro(@RequestBody LivroEntity livroEntity) {
        return livroService.atualizaLivro(livroEntity);
    }

}

