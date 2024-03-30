package com.senai.m1s9exerciciosemanal.repositories;

import com.senai.m1s9exerciciosemanal.entities.BibliotecarioEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {

    @Transactional
//  Indica que a consulta é uma operação de alteração da base de dados.
    @Modifying
    @Query("UPDATE BibliotecarioEntity l SET l.nome = :nome, l.email = :email, l.senha = :senha WHERE l.id = :id")
    void update(@Param("id") Long id,
                @Param("nome") String nome,
                @Param("email") String email,
                @Param("senha") String senha);

    // Exemplo de Native Queries
//    @Query(value = "UPDATE bibliotecarios SET nome = :nome, email = :email, senha = :senha WHERE id = :id", nativeQuery = true)
//    void update(@Param("id") Long id,
//                @Param("nome") String nome,
//                @Param("email") String email,
//                @Param("senha") String senha);
    
}
