package com.unialfa.base.business.profissao.resources.plus;

import com.unialfa.base.business.profissao.Profissao;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ProfissaoFindAllResource extends ProfissaoGetServiceResource {

    @GetMapping
    default List<Profissao> findAll() {
        return this.getService().findAll();
    }
}
