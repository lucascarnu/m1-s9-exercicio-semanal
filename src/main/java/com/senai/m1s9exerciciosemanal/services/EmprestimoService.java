package com.senai.m1s9exerciciosemanal.services;

import com.senai.m1s9exerciciosemanal.entities.EmprestimoEntity;
import com.senai.m1s9exerciciosemanal.entities.LivroEntity;
import com.senai.m1s9exerciciosemanal.entities.MembroEntity;
import com.senai.m1s9exerciciosemanal.repositories.EmprestimoRepository;
import com.senai.m1s9exerciciosemanal.repositories.LivroRepository;
import com.senai.m1s9exerciciosemanal.repositories.MembroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;
    private final MembroRepository membroRepository;
    private final LivroRepository livroRepository;

    public EmprestimoEntity salvarEmprestimo(Long idMembro, Long idLivro) {
        MembroEntity membro = membroRepository.findById(idMembro)
                .orElseThrow(() -> new RuntimeException("Membro não encontrado"));
        LivroEntity livro = livroRepository.findById(idLivro)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado"));


        EmprestimoEntity emprestimo = new EmprestimoEntity();
        emprestimo.setMembro(membro);
        emprestimo.setLivro(livro);
        emprestimo.setDataEmprestimo(LocalDate.now());

        return emprestimoRepository.save(emprestimo);
    }


    public List<EmprestimoEntity> listarEmprestimo() {
        return emprestimoRepository.findAll();
    }

    public void apagarEmprestimo(Long id) {
        emprestimoRepository.deleteById(id);
    }

    public EmprestimoEntity atualizarEmprestimo(EmprestimoEntity emprestimoEntity) {
        emprestimoRepository.update(
                emprestimoEntity.getId(),
                emprestimoEntity.getDataDevolucao()
        );
        return emprestimoEntity;
    }


}
