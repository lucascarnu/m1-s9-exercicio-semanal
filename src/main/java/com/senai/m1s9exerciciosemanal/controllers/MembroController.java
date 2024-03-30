package com.senai.m1s9exerciciosemanal.controllers;

import com.senai.m1s9exerciciosemanal.entities.LivroEntity;
import com.senai.m1s9exerciciosemanal.entities.MembroEntity;
import com.senai.m1s9exerciciosemanal.services.MembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/membros")
public class MembroController {

    private final MembroService membroService;

    @PostMapping
    public MembroEntity adicionarLivros(@RequestBody MembroEntity membroEntity) {
        return membroService.salvarMembro(membroEntity);
    }

    @GetMapping
    public List<MembroEntity>retornarMembros() {
        return membroService.listarMembros();
    }

    @DeleteMapping
    public String apagarMembro(@RequestParam("id") Long id) {
        membroService.apagarMembro(id);
        return "Membro apagado";
    }

    @PutMapping
    public MembroEntity atualizarMembro(@RequestBody MembroEntity membroEntity) {
        return membroService.atualizarMembro(membroEntity);
    }

}
