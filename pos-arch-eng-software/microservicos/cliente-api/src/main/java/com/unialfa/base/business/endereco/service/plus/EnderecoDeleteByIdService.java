package com.unialfa.base.business.endereco.service.plus;

public interface EnderecoDeleteByIdService extends EnderecoGetRepositoryService {

    default void deleteById(Long id) {
        this.getRepository().deleteById(id);
    }
}
