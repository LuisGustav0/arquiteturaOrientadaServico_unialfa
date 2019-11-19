package com.unialfa.base.business.profissao.service.plus;

import com.unialfa.base.business.profissao.Profissao;
import com.unialfa.base.business.profissao.respository.ProfissaoRepository;

import java.util.Optional;

public interface ProfissaoFindById extends ProfissaoRepository {

    default Optional<Profissao> findById(Long id) {
        return this.findById(id);
    }
}
