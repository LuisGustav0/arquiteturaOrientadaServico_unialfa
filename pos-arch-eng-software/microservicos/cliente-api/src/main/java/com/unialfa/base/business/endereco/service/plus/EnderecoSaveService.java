package com.unialfa.base.business.endereco.service.plus;

import com.unialfa.base.business.endereco.Endereco;

public interface EnderecoSaveService extends EnderecoGetRepositoryService {

    default Endereco save(Endereco endereco) {
        return this.getRepository().save(endereco);
    }
}
