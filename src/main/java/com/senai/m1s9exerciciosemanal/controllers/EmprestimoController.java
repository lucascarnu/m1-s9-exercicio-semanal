package com.senai.m1s9exerciciosemanal.controllers;

import com.senai.m1s9exerciciosemanal.entities.EmprestimoEntity;
import com.senai.m1s9exerciciosemanal.entities.LivroEntity;
import com.senai.m1s9exerciciosemanal.services.EmprestimoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private final EmprestimoService emprestimoService;

    @PostMapping
    public EmprestimoEntity adicionarEmprestimo(@RequestBody Map<String, Long> requestBody) {
        Long idMembro = requestBody.get("idMembro");
        Long idLivro = requestBody.get("idLivro");


        return emprestimoService.salvarEmprestimo(idMembro, idLivro);
    }

    @GetMapping
    public List<EmprestimoEntity> retornarEmprestimo() {
        return emprestimoService.listarEmprestimo();
    }

    @DeleteMapping
    public String apagarEmprestimo(@RequestParam("id") Long id) {
        emprestimoService.apagarEmprestimo(id);
        return "Emprestimo apagado";
    }

    @PutMapping
    public EmprestimoEntity atualizarEmprestimo(@RequestBody EmprestimoEntity emprestimoEntity) {
        return emprestimoService.atualizarEmprestimo(emprestimoEntity);
    }

}
