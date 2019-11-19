package com.unialfa.base.business.endereco.resource;

import com.unialfa.base.business.endereco.Endereco;
import com.unialfa.base.business.endereco.service.EnderecoService;
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
@RequestMapping(path = "/endereco")
public class EnderecoResource {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> findById(@PathVariable Long id) {
        Optional<Endereco> optEndereco = this.enderecoService.findById(id);

        return optEndereco.map(ResponseEntity::ok)
                          .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Endereco> findAll() {
        return this.enderecoService.findAll();
    }

    @PostMapping
    public ResponseEntity<Endereco> save(@RequestBody Endereco endereco) {
        Endereco enderecoSalvo = this.enderecoService.save(endereco);

        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoSalvo);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        this.enderecoService.deleteById(id);
    }
}
