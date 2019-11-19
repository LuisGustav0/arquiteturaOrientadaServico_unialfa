package com.unialfa.base.business.profissao.resources;

import com.unialfa.base.business.profissao.service.ProfissaoService;
import com.unialfa.base.business.profissao.Profissao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/profissao")
public class ProfissaoResource {

    @Autowired
    private ProfissaoService profissaoService;

    @GetMapping("/{id}")
    public ResponseEntity<Profissao> findById(@PathVariable Long id) {
        Optional<Profissao> optProfissao = this.profissaoService.findById(id);

        return optProfissao.map(ResponseEntity::ok)
                           .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Profissao> findAll() {
        return this.profissaoService.findAll();
    }

    @PostMapping
    public ResponseEntity<Profissao> save(@RequestBody Profissao profissao) {
        Profissao profissaoSalvo = this.profissaoService.save(profissao);

        return ResponseEntity.status(HttpStatus.CREATED).body(profissaoSalvo);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        this.profissaoService.deleteById(id);
    }
}
