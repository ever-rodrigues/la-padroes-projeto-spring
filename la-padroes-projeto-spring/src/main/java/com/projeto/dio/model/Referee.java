package com.projeto.dio.model;

import javax.persistence.*;

@Entity
public class Referee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;

    @ManyToOne
    private Endereco endereco;

    private Long getId(){return id;}

    private void setId(Long id){this.id=id;}

    private String getNome(){return nome;}

    private void setNome(String nome){this.nome=nome;}

    private Endereco getEndereco(){return endereco;}

    private void setEndereco(Endereco endereco){this.endereco=endereco;}
}
