package com.dio.Facade;

import com.dio.subsistema1.crm.CrmService;
import com.dio.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cidade,cep,estado);



    }

}
