package com.unialfa.base.business.estado.resources;

import com.unialfa.base.business.estado.EstadoRepository;
import com.unialfa.base.business.estado.Estado;
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
@RequestMapping(path = "/estado")
public class EstadoResource {

    @Autowired
    private EstadoRepository estadoRepository;

    @PostMapping
    public ResponseEntity<List<Estado>> save(@RequestBody List<Estado> listaEstado) {
        List<Estado> listaEstadoSalvo = this.estadoRepository.saveAll(listaEstado);

        return ResponseEntity.status(HttpStatus.CREATED).body(listaEstadoSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estado> findById(@PathVariable Long id) {
        Optional<Estado> optEstado = this.estadoRepository.findById(id);

        return optEstado.map(ResponseEntity::ok)
                        .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Estado> findAll() {
        return this.estadoRepository.findAll();
    }
}
