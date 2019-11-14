package com.unialfa.controller;

import com.unialfa.model.Cidade;
import com.unialfa.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/cidade")
public class CidadeController {

    @Autowired
    private CidadeRepository cidadeRepository;

    @PostMapping
    public ResponseEntity<List<Cidade>> save(@RequestBody List<Cidade> listaCidade) {
        List<Cidade> listaCidadeSalvo = this.cidadeRepository.saveAll(listaCidade);

        return ResponseEntity.status(HttpStatus.CREATED).body(listaCidadeSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cidade> findById(@PathVariable Long id) {
        Optional<Cidade> optCidade = this.cidadeRepository.findById(id);

        return optCidade.map(ResponseEntity::ok)
                         .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Cidade> findAll() {
        return this.cidadeRepository.findAll();
    }
}
