package com.unialfa.base.business.profissao.resources;

import com.unialfa.base.business.profissao.resources.interfaces.IProfissaoResource;
import com.unialfa.base.business.profissao.service.ProfissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/profissao")
public class ProfissaoResource implements IProfissaoResource {

    @Autowired
    private ProfissaoService profissaoService;

    @Override
    public ProfissaoService getService() {
        return this.profissaoService;
    }
}
