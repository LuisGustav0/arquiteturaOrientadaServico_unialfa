package com.unialfa.base.business.cliente.service.plus;

import com.unialfa.base.business.cliente.Cliente;

import java.util.List;

public interface ClienteFindAllService extends ClienteGetRepositoryService {

    default List<Cliente> findAll() {
        return this.getRepository().findAll();
    }
}
