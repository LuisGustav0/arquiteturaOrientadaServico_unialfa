package com.unialfa.services;

import com.unialfa.model.Cliente;
import com.unialfa.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }
}
