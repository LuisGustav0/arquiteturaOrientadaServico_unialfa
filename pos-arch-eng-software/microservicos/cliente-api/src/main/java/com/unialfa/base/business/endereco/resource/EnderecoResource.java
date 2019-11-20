package com.unialfa.base.business.endereco.resource;

import com.unialfa.base.business.endereco.resource.interfaces.IEnderecoResource;
import com.unialfa.base.business.endereco.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/endereco")
public class EnderecoResource implements IEnderecoResource {

    @Autowired
    private EnderecoService enderecoService;

    @Override
    public EnderecoService getService() {
        return this.enderecoService;
    }
}
