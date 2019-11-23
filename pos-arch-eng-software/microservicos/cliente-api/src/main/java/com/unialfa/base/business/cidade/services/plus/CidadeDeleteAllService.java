package com.unialfa.base.business.cidade.services.plus;

public interface CidadeDeleteAllService extends CidadeGetRepositoryService {

    default void deleteAll() {
        this.getRepository().deleteAll();
    }
}
