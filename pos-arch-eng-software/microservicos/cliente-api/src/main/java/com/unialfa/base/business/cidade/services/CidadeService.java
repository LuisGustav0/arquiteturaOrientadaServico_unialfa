package com.unialfa.base.business.cidade.services;

import com.unialfa.base.business.cidade.respository.CidadeRepository;
import com.unialfa.base.business.cidade.services.interfaces.ICidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeService implements ICidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public CidadeRepository getRepository() {
        return this.cidadeRepository;
    }
}
