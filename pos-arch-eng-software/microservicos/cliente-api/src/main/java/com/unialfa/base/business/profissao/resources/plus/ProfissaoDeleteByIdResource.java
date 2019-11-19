package com.unialfa.base.business.profissao.resources.plus;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ProfissaoDeleteByIdResource extends ProfissaoGetServiceResource {

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    default void deleteById(@PathVariable Long id) {
        this.getService().deleteById(id);
    }
}
