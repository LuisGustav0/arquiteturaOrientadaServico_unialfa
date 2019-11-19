package com.unialfa.base.business.profissao.service.plus;

import com.unialfa.base.business.profissao.respository.ProfissaoRepository;

public interface ProfissaoDeleteById extends ProfissaoRepository {

    default void deleteById(Long id) {
        this.deleteById(id);
    }
}
