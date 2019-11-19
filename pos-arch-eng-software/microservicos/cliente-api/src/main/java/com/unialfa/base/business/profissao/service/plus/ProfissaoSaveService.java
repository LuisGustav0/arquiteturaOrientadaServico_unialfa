package com.unialfa.base.business.profissao.service.plus;

import com.unialfa.base.business.profissao.Profissao;

public interface ProfissaoSaveService extends ProfissaoGetRepositoryService {

    default Profissao save(Profissao profissao) {
        return this.getRepository().save(profissao);
    }
}
