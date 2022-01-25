package com.project.refereeAPI.entity;


import com.project.refereeAPI.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Anotacoes do Lombok -> ELE GERA OS CODIGOS AUTOMATICOS
//GATA ELE GERA AUTOMATICAMENTE UM GET E SETTER DEFAULT PRA GENTE!
//BUILDER DA UM PADRAO DE CONSTRUCAO DE OBJETOS (INSERE OS CONTRUTORES PRA GENTE!)
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;


    @Column(nullable = false)
    private String number;
}
