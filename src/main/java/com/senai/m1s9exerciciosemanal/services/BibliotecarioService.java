package com.senai.m1s9exerciciosemanal.services;

import com.senai.m1s9exerciciosemanal.entities.BibliotecarioEntity;
import com.senai.m1s9exerciciosemanal.repositories.BibliotecarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public BibliotecarioEntity salvarBibliotecario(BibliotecarioEntity bibliotecarioEntity) {
        return bibliotecarioRepository.save(bibliotecarioEntity);
    }

    public List<BibliotecarioEntity> listarBibliotecarios() {
        return bibliotecarioRepository.findAll();
    }

    public void apagarBibliotecario(Long id) {
        bibliotecarioRepository.deleteById(id);
    }

    public BibliotecarioEntity atualizarBibliotecario(BibliotecarioEntity bibliotecarioEntity) {
        bibliotecarioRepository.update(
                bibliotecarioEntity.getId(),
                bibliotecarioEntity.getNome(),
                bibliotecarioEntity.getEmail(),
                bibliotecarioEntity.getSenha()
        );
        return bibliotecarioEntity;
    }
}
