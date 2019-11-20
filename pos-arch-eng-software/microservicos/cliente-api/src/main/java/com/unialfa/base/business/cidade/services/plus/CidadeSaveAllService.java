package com.unialfa.base.business.cidade.services.plus;

import com.unialfa.base.business.cidade.Cidade;

import java.util.List;

public interface CidadeSaveAllService extends CidadeGetRepositoryService {

    default List<Cidade> saveAll(List<Cidade> listaCidade) {
        return this.getRepository().saveAll(listaCidade);
    }
}
