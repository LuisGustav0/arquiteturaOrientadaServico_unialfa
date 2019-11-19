package com.unialfa.base.business.cliente.service.plus;

import com.unialfa.base.business.cliente.respository.ClienteRepository;

public interface ClienteDeleteById extends ClienteRepository {

    default void deleteById(Long id) {
        this.deleteById(id);
    }
}
