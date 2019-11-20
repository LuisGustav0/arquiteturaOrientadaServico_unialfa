package com.unialfa.base.business.estado.services.plus;

import com.unialfa.base.business.estado.Estado;

import java.util.List;

public interface EstadoFindAllService extends EstadoGetRepositoryService {

    default List<Estado> findAll() {
        return this.getRepository().findAll();
    }
}
