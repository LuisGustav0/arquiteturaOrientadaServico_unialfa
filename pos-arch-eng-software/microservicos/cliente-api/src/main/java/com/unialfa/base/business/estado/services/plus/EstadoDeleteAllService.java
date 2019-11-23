package com.unialfa.base.business.estado.services.plus;

public interface EstadoDeleteAllService extends EstadoGetRepositoryService {

    default void deleteAll() {
        this.getRepository().deleteAll();
    }
}
