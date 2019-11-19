package com.unialfa.base.business.cliente.resource;

import com.unialfa.base.business.cliente.resource.interfaces.IClienteResource;
import com.unialfa.base.business.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteResource implements IClienteResource {

    @Autowired
    private ClienteService clienteService;

    @Override
    public ClienteService getService() {
        return this.clienteService;
    }
}
