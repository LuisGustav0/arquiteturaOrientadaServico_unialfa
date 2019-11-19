package com.unialfa.base.business.profissao.service.plus;

import com.unialfa.base.business.profissao.Profissao;
import com.unialfa.base.business.profissao.respository.ProfissaoRepository;

public interface ProfissaoSave extends ProfissaoRepository {

    default Profissao save(Profissao profissao) {
        return this.save(profissao);
    }
}
