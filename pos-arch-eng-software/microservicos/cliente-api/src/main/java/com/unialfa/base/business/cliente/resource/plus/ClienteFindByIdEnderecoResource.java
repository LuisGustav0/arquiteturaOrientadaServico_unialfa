package com.unialfa.base.business.cliente.resource.plus;

import com.unialfa.base.business.cliente.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ClienteFindByIdEnderecoResource extends ClienteGetServiceResource {

    @GetMapping("/findByIdEndereco/{id}")
    default ResponseEntity<Cliente> findByIdEndereco(@PathVariable Long id) {
        Cliente cliente = this.getService().findByIdEndereco(id);

        return cliente != null ? ResponseEntity.ok(cliente) : ResponseEntity.notFound().build();
    }
}
