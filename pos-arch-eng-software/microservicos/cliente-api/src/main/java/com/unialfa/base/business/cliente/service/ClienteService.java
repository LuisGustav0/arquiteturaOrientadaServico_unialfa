package com.unialfa.base.business.cliente.service;

import com.unialfa.base.business.cliente.respository.ClienteRepository;
import com.unialfa.base.business.cliente.service.interfaces.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public ClienteRepository getRepository() {
        return this.clienteRepository;
    }
}
