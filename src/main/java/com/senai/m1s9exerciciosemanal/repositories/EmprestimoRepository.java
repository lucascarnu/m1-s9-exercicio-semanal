package com.senai.m1s9exerciciosemanal.repositories;

import com.senai.m1s9exerciciosemanal.entities.EmprestimoEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoEntity, Long> {

    @Transactional
//  Indica que a consulta é uma operação de alteração da base de dados.
    @Modifying
    @Query("UPDATE EmprestimoEntity l SET l.dataDevolucao = :dataDevolucao WHERE l.id = :id")
    void update(@Param("id") Long id,
                @Param("dataDevolucao") LocalDate dataDevolucao);
}
