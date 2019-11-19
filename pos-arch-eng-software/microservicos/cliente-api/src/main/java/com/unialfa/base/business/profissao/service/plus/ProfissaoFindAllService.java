package com.unialfa.base.business.profissao.service.plus;

import com.unialfa.base.business.profissao.Profissao;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ProfissaoFindAllService extends ProfissaoGetRepositoryService {

    @GetMapping
    default List<Profissao> findAll() {
        return this.getRepository().findAll();
    }
}
