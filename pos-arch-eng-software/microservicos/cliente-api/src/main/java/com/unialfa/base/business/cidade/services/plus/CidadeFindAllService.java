package com.unialfa.base.business.cidade.services.plus;

import com.unialfa.base.business.cidade.Cidade;

import java.util.List;

public interface CidadeFindAllService extends CidadeGetRepositoryService {

    default List<Cidade> findAll() {
        return this.getRepository().findAll();
    }
}
