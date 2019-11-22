package com.unialfa.base.business.cidade.resources;

import com.unialfa.base.business.cidade.resources.interfaces.ICidadeResource;
import com.unialfa.base.business.cidade.services.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cidade")
public class CidadeResource implements ICidadeResource {

    @Autowired
    private CidadeService cidadeService;

    @Override
    public CidadeService getService() {
        return this.cidadeService;
    }
}
