package com.projeto.dio.service;


import com.projeto.dio.model.Referee;


public interface RefereeService {
    Iterable<Referee> buscarTodos();
    Referee buscarPorId(Long id);
    void inserir(Referee referee);
    void atualizar(Long id, Referee referee);
    void deletar(Long id);

}
