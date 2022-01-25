package com.projeto.dio.controller;


import com.projeto.dio.model.Referee;
import com.projeto.dio.service.RefereeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RefereeRestController {
    @Autowired
    private RefereeService refereeService;

    @GetMapping
    public ResponseEntity<Iterable<Referee>> buscarTodos(){
        return ResponseEntity.ok(refereeService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Referee> buscarPorId(@PathVariable Long id){
        return ResponseEntity.ok(refereeService.buscarPorId(id));
    }


    @PostMapping
    public ResponseEntity<Referee> inserir (@RequestBody Referee referee){
        refereeService.inserir(referee);
        return ResponseEntity.ok(referee);
    }

    @PutMapping ("/{id}")
    public ResponseEntity<Referee> atualizar (@PathVariable Long id, @RequestBody Referee referee){
        refereeService.atualizar(id,referee);
        return ResponseEntity.ok(referee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        refereeService.deletar(id);
        return ResponseEntity.ok().build();
    }


}
