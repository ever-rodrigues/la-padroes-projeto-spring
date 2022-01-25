package com.dio.InjecaoDependencia.Cbf;

import org.springframework.beans.factory.annotation.Autowired;

public class Profissional {
    public static void main(String[] args) {
    Profissional profissional = new Profissional(new Var());
    profissional.area();

    System.out.println("-----------------");
    Profissional profissional1=new Profissional(new Supervisor());
    profissional1.area();

    }
    @Autowired
    private Cargo cargo;

    public Profissional(Cargo obj){
        this.cargo=obj;
    }

    public void area(){
        this.cargo.getTipo();
    }
}
