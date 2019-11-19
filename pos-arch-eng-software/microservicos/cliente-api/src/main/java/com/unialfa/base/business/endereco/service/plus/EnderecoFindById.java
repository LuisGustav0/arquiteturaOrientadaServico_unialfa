package com.unialfa.base.business.endereco.service.plus;

import com.unialfa.base.business.endereco.Endereco;
import com.unialfa.base.business.endereco.repository.EnderecoRepository;

import java.util.Optional;

public interface EnderecoFindById extends EnderecoRepository {

    default Optional<Endereco> findById(Long id) {
        return this.findById(id);
    }
}
