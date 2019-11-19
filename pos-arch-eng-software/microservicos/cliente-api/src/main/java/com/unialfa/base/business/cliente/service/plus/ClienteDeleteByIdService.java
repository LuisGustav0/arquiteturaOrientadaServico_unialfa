package com.unialfa.base.business.cliente.service.plus;

public interface ClienteDeleteByIdService extends ClienteGetRepositoryService {

    default void deleteById(Long id) {
        this.getRepository().deleteById(id);
    }
}
