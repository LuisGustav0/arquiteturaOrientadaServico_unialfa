package com.unialfa.base.business.profissao.service.plus;

import com.unialfa.base.business.profissao.Profissao;
import com.unialfa.base.business.profissao.respository.ProfissaoRepository;

import java.util.List;

public interface ProfissaoFindAll extends ProfissaoRepository {

    default List<Profissao> findAll() {
        return this.findAll();
    }
}
