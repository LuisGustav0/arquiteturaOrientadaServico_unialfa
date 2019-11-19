package com.unialfa.base.business.cliente.service.plus;

import com.unialfa.base.business.cliente.Cliente;
import com.unialfa.base.business.cliente.respository.ClienteRepository;

import java.util.Optional;

public interface ClienteFindById extends ClienteRepository {

    default Optional<Cliente> findById(Long id) {
        return this.findById(id);
    }
}
