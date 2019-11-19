package com.unialfa.base.business.cliente.service.plus;

import com.unialfa.base.business.cliente.Cliente;

public interface ClienteSaveService extends ClienteGetRepositoryService {

    default Cliente save(Cliente cliente) {
        return this.getRepository().save(cliente);
    }
}
