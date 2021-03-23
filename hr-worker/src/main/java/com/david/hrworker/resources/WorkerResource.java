package com.david.hrworker.resources;

import com.david.hrworker.entities.Worker;
import com.david.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//pra funcionar como um controller
@RestController
// informando o caminho que vai ser o padrão
@RequestMapping(value = "/workers")
public class WorkerResource {

    // pro inspring fazer a injeção de dependencia automaticamente
    @Autowired
    private WorkerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    // pro Id do parametro reconhecer o id do mapping usar @PAthVariable
    public ResponseEntity<Worker> findById (@PathVariable Long id) {
        Worker obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }
}