package com.unialfa.base.business.cidade.resources.plus;

import com.unialfa.base.business.cidade.Cidade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface CidadeFindByIdResource extends CidadeGetServiceResource {

    @GetMapping("/{id}")
    default ResponseEntity<Cidade> findById(@PathVariable Long id) {
        Optional<Cidade> optCidade = this.getService().findById(id);

        return optCidade.map(ResponseEntity::ok)
                        .orElse(ResponseEntity.notFound().build());
    }
}
