package com.unialfa.base.business.cliente.resource.plus;

import com.unialfa.base.business.cliente.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface ClienteFindByIdResource extends ClienteGetServiceResource {

    @GetMapping("/{id}")
    default ResponseEntity<Cliente> findById(@PathVariable Long id) {
        Optional<Cliente> optCliente = this.getService().findById(id);

        return optCliente.map(ResponseEntity::ok)
                         .orElse(ResponseEntity.notFound().build());
    }
}
