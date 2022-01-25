package com.dio.InjecaoDependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Condutor {
    @GetMapping("/")
    public static void main(String[] args) {

        Condutor condutor= new Condutor(new Moto());
        condutor.automovel();

    }
    @Autowired
    private Veiculo veiculo;

    public Condutor(Veiculo obj){
        this.veiculo=obj;
    }
    public void automovel(){
        veiculo.acao();
    }
}
