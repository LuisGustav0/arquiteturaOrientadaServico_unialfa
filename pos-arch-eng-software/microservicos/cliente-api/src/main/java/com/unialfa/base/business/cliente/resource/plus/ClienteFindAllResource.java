package com.unialfa.base.business.cliente.resource.plus;

import com.unialfa.base.business.cliente.Cliente;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ClienteFindAllResource extends ClienteGetServiceResource {

    @GetMapping
    default List<Cliente> findAll() {
        return this.getService().findAll();
    }
}
