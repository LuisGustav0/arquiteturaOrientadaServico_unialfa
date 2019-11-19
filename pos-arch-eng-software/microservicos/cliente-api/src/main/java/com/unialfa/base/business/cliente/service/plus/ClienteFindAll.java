package com.unialfa.base.business.cliente.service.plus;

import com.unialfa.base.business.cliente.Cliente;
import com.unialfa.base.business.cliente.respository.ClienteRepository;

import java.util.List;

public interface ClienteFindAll extends ClienteRepository {

    default List<Cliente> findAll() {
        return this.findAll();
    }
}
