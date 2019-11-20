package com.unialfa.base.business.estado.resources.plus;

import com.unialfa.base.business.estado.Estado;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface EstadoFindAllResource extends EstadoGetServiceResource {

    @GetMapping
    default List<Estado> findAll() {
        return this.getService().findAll();
    }
}
