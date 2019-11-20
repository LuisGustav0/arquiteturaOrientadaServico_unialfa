package com.unialfa.base.business.endereco.service.plus;

import com.unialfa.base.business.endereco.Endereco;

import java.util.Optional;

public interface EnderecoFindByIdService extends EnderecoGetRepositoryService {

    default Optional<Endereco> findById(Long id) {
        return this.getRepository().findById(id);
    }
}
