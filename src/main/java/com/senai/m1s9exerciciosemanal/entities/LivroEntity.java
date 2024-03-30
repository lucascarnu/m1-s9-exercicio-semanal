package com.senai.m1s9exerciciosemanal.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "livros")
@Entity
@Data
@NoArgsConstructor
public class LivroEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pode ser AUTO?
    private Long id;

    private String titulo;

    private String autor;

    private Integer anoPublicacao;

}
