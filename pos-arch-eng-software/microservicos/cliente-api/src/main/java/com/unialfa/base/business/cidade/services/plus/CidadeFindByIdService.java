package com.unialfa.base.business.cidade.services.plus;

import com.unialfa.base.business.cidade.Cidade;

import java.util.Optional;

public interface CidadeFindByIdService extends CidadeGetRepositoryService {

    default Optional<Cidade> findById(Long id) {
        return this.getRepository().findById(id);
    }
}
