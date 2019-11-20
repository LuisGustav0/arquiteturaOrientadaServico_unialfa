package com.unialfa.base.business.cidade.resources.plus;

import com.unialfa.base.business.cidade.Cidade;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface CidadeFindAllResource extends CidadeGetServiceResource {

    @GetMapping
    default List<Cidade> findAll() {
        return this.getService().findAll();
    }
}
