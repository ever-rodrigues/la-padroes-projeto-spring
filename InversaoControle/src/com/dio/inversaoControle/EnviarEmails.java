package com.dio.inversaoControle;

public class EnviarEmails {
    public EnviarEmails(String tipo, String endereco, String senha){

    }

    public void retornar(String mensagem){
        System.out.println("Email enviado");
    }
    public static EnviarEmails obterDadosEmail(){
        return new EnviarEmails("stmp","contato@email.com","senha");
    }
}
