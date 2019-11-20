package com.unialfa.base.business.estado.services.plus;

import com.unialfa.base.business.estado.Estado;

import java.util.List;

public interface EstadoSaveAllService extends EstadoGetRepositoryService {

    default List<Estado> saveAll(List<Estado> listaEstado) {
        return this.getRepository().saveAll(listaEstado);
    }
}
