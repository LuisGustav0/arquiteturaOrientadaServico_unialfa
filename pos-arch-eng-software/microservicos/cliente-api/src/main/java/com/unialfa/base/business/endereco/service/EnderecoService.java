package com.unialfa.base.business.endereco.service;

import com.unialfa.base.business.endereco.repository.EnderecoRepository;
import com.unialfa.base.business.endereco.service.interfaces.IEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService implements IEnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public EnderecoRepository getRepository() {
        return this.enderecoRepository;
    }
}
