package com.senai.m1s9exerciciosemanal.repositories;

import com.senai.m1s9exerciciosemanal.entities.LivroEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

//    Garante que todos os métodos sejam executados como uma transação coesa,
//    abrindo e fechando uma transação para cada método. Se houver falha, as mudanças são revertidas
//    garantindo a persistência dos dados.
    @Transactional
//  Indica que a consulta é uma operação de alteração da base de dados.
    @Modifying
    @Query("UPDATE LivroEntity l SET l.titulo = :titulo, l.autor = :autor, l.anoPublicacao = :anoPublicacao WHERE l.id = :id")
    void update(@Param("id") Long id,
                @Param("titulo") String titulo,
                @Param("autor") String autor,
                @Param("anoPublicacao") Integer anoPublicacao);
}
