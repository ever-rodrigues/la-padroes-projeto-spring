package com.projeto.dio.service.impl;

import com.projeto.dio.model.Endereco;
import com.projeto.dio.model.EnderecoRepository;
import com.projeto.dio.model.Referee;
import com.projeto.dio.model.RefereeRepository;
import com.projeto.dio.service.RefereeService;
import com.projeto.dio.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class RefereeServiceImpl implements RefereeService {
    @Autowired
    private RefereeRepository refereeRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;


    @Override
    public Iterable<Referee> buscarTodos() {
        return refereeRepository.findAll();
    }

    @Override
    public Referee buscarPorId(Long id) {
        Optional<Referee> referee=refereeRepository.findById(id);
        return referee.get();
    }

    @Override
    public void inserir(Referee referee) {
        salvarRefereeComCep(referee);

    }

    @Override
    public void atualizar(Long id, Referee referee) {
        Optional<Referee> refereeBd=refereeRepository.findById(id);
        if(refereeBd.isPresent()){
            salvarRefereeComCep(referee);
        }

    }

    @Override
    public void deletar(Long id) {
    refereeRepository.deleteById(id);
    }

private void salvarRefereeComCep(Referee referee){
        String cep = referee.getEndereco().getCep();
    Endereco endereco = enderecoRepository.findById(cep).orElseGet(()->{
        Endereco novoEndereco = viaCepService.consultarCep(cep);
        enderecoRepository.save(novoEndereco);
        return novoEndereco;
    });
    referee.setEndereco(endereco);
    refereeRepository.save(referee);
}




}

