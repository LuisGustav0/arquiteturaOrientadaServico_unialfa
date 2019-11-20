package com.unialfa.base.business.estado.services.plus;

import com.unialfa.base.business.estado.Estado;

import java.util.Optional;

public interface EstadoFindByIdService extends EstadoGetRepositoryService {

    default Optional<Estado> findById(Long id) {
        return this.getRepository().findById(id);
    }
}
