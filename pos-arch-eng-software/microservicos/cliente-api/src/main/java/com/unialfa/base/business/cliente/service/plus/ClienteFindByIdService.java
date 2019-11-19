package com.unialfa.base.business.cliente.service.plus;

import com.unialfa.base.business.cliente.Cliente;

import java.util.Optional;

public interface ClienteFindByIdService extends ClienteGetRepositoryService {

    default Optional<Cliente> findById(Long id) {
        return this.getRepository().findById(id);
    }
}
