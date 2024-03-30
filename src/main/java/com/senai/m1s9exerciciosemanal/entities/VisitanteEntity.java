package com.senai.m1s9exerciciosemanal.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Table(name = "visitantes")
@Entity
@Data
@NoArgsConstructor
public class VisitanteEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pode ser AUTO?
    private Long id;

    private String nome;

    private String fone;

}
