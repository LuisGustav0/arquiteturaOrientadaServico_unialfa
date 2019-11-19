package com.unialfa.base.business.profissao.service;

import com.unialfa.base.business.profissao.respository.ProfissaoRepository;
import com.unialfa.base.business.profissao.service.interfaces.IProfissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfissaoService implements IProfissaoService {

    @Autowired
    private ProfissaoRepository profissaoRepository;

    @Override
    public ProfissaoRepository getRepository() {
        return this.profissaoRepository;
    }
}
