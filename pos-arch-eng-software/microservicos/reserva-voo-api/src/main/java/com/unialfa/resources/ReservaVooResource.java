package com.unialfa.resources;

import com.unialfa.model.ReservaVoo;
import com.unialfa.services.ReservaVooService;
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
@RequestMapping(path = "/reserva-voo")
public class ReservaVooResource {

    @Autowired
    private ReservaVooService reservaVooService;

    @GetMapping("/{id}")
    public ResponseEntity<ReservaVoo> findById(@PathVariable Long id) {
        Optional<ReservaVoo> optReservaVoo = this.reservaVooService.findById(id);

        return optReservaVoo.map(ResponseEntity::ok)
                          .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<ReservaVoo> findAll() {
        return this.reservaVooService.findAll();
    }

    @PostMapping
    public ResponseEntity<ReservaVoo> save(@RequestBody ReservaVoo reservaVoo) {
        ReservaVoo reservaVooSalvo = this.reservaVooService.save(reservaVoo);

        return ResponseEntity.status(HttpStatus.CREATED).body(reservaVooSalvo);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        this.reservaVooService.deleteById(id);
    }
}
