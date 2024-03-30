package com.senai.m1s9exerciciosemanal.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;



@Table(name = "emprestimos")
@Entity
@Data
@NoArgsConstructor
public class EmprestimoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // trocando para EAGER consigo pegar os Emprestimos com todos os detalhes
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "livro_id", nullable = false)
    // Nesta entidade tenho relações bidirecionais
    @JsonIgnore
    private LivroEntity livro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "membro_id", nullable = false)
    @JsonIgnore
    private MembroEntity membro;

    private LocalDate dataEmprestimo = LocalDate.now();

    private LocalDate dataDevolucao;

}


