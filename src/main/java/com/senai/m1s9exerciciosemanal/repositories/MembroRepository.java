package com.senai.m1s9exerciciosemanal.repositories;

import com.senai.m1s9exerciciosemanal.entities.MembroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroEntity, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE MembroEntity l SET l.nome = :nome, l.endereco = :endereco, l.fone = :fone WHERE l.id = :id")
    void update(@Param("id") Long id,
                @Param("nome") String nome,
                @Param("endereco") String endereco,
                @Param("fone") String fone);

}
