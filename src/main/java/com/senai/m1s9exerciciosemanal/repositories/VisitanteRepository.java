package com.senai.m1s9exerciciosemanal.repositories;

import com.senai.m1s9exerciciosemanal.entities.VisitanteEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitanteEntity, Long> {

    @Transactional
//  Indica que a consulta é uma operação de alteração da base de dados.
    @Modifying
    @Query("UPDATE VisitanteEntity l SET l.nome = :nome, l.fone = :fone WHERE l.id = :id")
    void update(@Param("id") Long id,
                @Param("nome") String nome,
                @Param("fone") String fone);


}
