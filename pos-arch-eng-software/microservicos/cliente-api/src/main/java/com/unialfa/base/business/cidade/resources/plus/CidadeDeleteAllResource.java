package com.unialfa.base.business.cidade.resources.plus;

import org.springframework.web.bind.annotation.DeleteMapping;

public interface CidadeDeleteAllResource extends CidadeGetServiceResource {

    @DeleteMapping
    default void deleteAll() {
        this.getService().deleteAll();
    }
}
