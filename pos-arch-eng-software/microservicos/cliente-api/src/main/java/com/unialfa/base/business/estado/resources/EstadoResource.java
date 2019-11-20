package com.unialfa.base.business.estado.resources;

import com.unialfa.base.business.estado.resources.interfaces.IEstadoResource;
import com.unialfa.base.business.estado.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/estado")
public class EstadoResource implements IEstadoResource {

    @Autowired
    private EstadoService estadoService;

    @Override
    public EstadoService getService() {
        return this.estadoService;
    }
}
