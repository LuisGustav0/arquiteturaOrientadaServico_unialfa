package com.unialfa.base.business.estado.resources.plus;

import com.unialfa.base.business.estado.Estado;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface EstadoFindByIdResource extends EstadoGetServiceResource {

    @GetMapping("/{id}")
    default ResponseEntity<Estado> findById(@PathVariable Long id) {
        Optional<Estado> optEstado = this.getService().findById(id);

        return optEstado.map(ResponseEntity::ok)
                        .orElse(ResponseEntity.notFound().build());
    }
}
