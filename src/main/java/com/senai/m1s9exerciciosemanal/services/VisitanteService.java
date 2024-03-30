package com.senai.m1s9exerciciosemanal.services;

import com.senai.m1s9exerciciosemanal.entities.LivroEntity;
import com.senai.m1s9exerciciosemanal.entities.VisitanteEntity;
import com.senai.m1s9exerciciosemanal.repositories.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitanteService {

    private final VisitanteRepository visitanteRepository;

    public VisitanteEntity salvarVisitante(VisitanteEntity visitanteEntity) {
        return visitanteRepository.save(visitanteEntity);
    }

    public List<VisitanteEntity> listarVisitantes() {
        return visitanteRepository.findAll();
    }

    public void apagarVisitante(Long id) {
        visitanteRepository.deleteById(id);
    }

    public VisitanteEntity atualizarVisitante(VisitanteEntity visitanteEntity) {
        visitanteRepository.update(
                visitanteEntity.getId(),
                visitanteEntity.getNome(),
                visitanteEntity.getFone()
        );
        return visitanteEntity;
    }

}
