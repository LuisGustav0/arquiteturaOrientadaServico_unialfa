package com.unialfa.base.business.endereco.service.plus;

import com.unialfa.base.business.endereco.Endereco;

import java.util.List;

public interface EnderecoFindAllService extends EnderecoGetRepositoryService {

    default List<Endereco> findAll() {
        return this.getRepository().findAll();
    }
}
