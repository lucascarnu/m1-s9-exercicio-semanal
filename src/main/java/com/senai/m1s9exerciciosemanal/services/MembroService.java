package com.senai.m1s9exerciciosemanal.services;

import com.senai.m1s9exerciciosemanal.entities.MembroEntity;
import com.senai.m1s9exerciciosemanal.repositories.MembroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembroService {

    private final MembroRepository membroRepository;

    public MembroEntity salvarMembro(MembroEntity membroEntity) {
        return membroRepository.save(membroEntity);
    }

    public List<MembroEntity> listarMembros() {
        return membroRepository.findAll();
    }

    public void apagarMembro(Long id) {
        membroRepository.deleteById(id);
    }

    public MembroEntity atualizarMembro(MembroEntity membroEntity) {
        membroRepository.update(
                membroEntity.getId(),
                membroEntity.getNome(),
                membroEntity.getEndereco(),
                membroEntity.getFone()
        );
        return membroEntity;
    }


}
