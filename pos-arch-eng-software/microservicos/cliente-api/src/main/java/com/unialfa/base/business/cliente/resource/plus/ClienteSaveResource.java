package com.unialfa.base.business.cliente.resource.plus;

import com.unialfa.base.business.cliente.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

public interface ClienteSaveResource extends ClienteGetServiceResource {

    @PostMapping
    default ResponseEntity<Cliente> save(@Valid @RequestBody Cliente cliente) {
        Cliente clienteSalvo = this.getService().save(cliente);

        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalvo);
    }
}
