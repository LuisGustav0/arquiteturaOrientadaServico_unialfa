package com.unialfa.base.business.endereco.service.plus;

import com.unialfa.base.business.endereco.repository.EnderecoRepository;

public interface EnderecoDeleteById extends EnderecoRepository {

    default void deleteById(Long id) {
        this.deleteById(id);
    }
}
