package com.unialfa.base.business.endereco.resource.plus;

import com.unialfa.base.business.endereco.Endereco;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface EnderecoFindAllResource extends EnderecoGetServiceResource {

    @GetMapping
    default List<Endereco> findAll() {
        return this.getService().findAll();
    }
}
