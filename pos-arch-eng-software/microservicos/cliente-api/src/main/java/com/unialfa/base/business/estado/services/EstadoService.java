package com.unialfa.base.business.estado.services;

import com.unialfa.base.business.estado.repository.EstadoRepository;
import com.unialfa.base.business.estado.services.interfaces.IEstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoService implements IEstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public EstadoRepository getRepository() {
        return this.estadoRepository;
    }
}
