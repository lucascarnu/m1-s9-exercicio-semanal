package com.senai.m1s9exerciciosemanal.services;

import com.senai.m1s9exerciciosemanal.entities.LivroEntity;
import com.senai.m1s9exerciciosemanal.repositories.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;

    public LivroEntity salvarLivro(LivroEntity livroEntity) {
        return livroRepository.save(livroEntity);
    }

    public List<LivroEntity> listarLivros() {
        return livroRepository.findAll();
    }

    public void apagarLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public LivroEntity atualizaLivro(LivroEntity livroEntity) {
         livroRepository.update(
                livroEntity.getId(),
                livroEntity.getTitulo(),
                livroEntity.getAutor(),
                livroEntity.getAnoPublicacao()
        );
         return livroEntity;
    }

}
