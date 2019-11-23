package com.unialfa.base.business.estado.resources.plus;

import org.springframework.web.bind.annotation.DeleteMapping;

public interface EstadoDeleteAllResource extends EstadoGetServiceResource {

    @DeleteMapping
    default void deleteAll() {
        this.getService().deleteAll();
    }
}
