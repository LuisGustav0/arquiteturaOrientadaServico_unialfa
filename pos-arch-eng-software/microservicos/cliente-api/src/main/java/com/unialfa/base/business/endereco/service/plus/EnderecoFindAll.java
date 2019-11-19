package com.unialfa.base.business.endereco.service.plus;

import com.unialfa.base.business.endereco.Endereco;
import com.unialfa.base.business.endereco.repository.EnderecoRepository;

import java.util.List;

public interface EnderecoFindAll extends EnderecoRepository {

    default List<Endereco> findAll() {
        return this.findAll();
    }
}
