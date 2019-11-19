package com.unialfa.base.business.cliente.service.plus;

import com.unialfa.base.business.cliente.Cliente;
import com.unialfa.base.business.cliente.respository.ClienteRepository;

public interface ClienteSave extends ClienteRepository {

    default Cliente save(Cliente cliente) {
        return this.save(cliente);
    }
}
