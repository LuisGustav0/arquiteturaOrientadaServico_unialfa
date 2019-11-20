package com.unialfa.base.business.endereco.resource.plus;

import com.unialfa.base.business.endereco.Endereco;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface EnderecoFindByIdResource extends EnderecoGetServiceResource {

    @GetMapping("/{id}")
    default ResponseEntity<Endereco> findById(@PathVariable Long id) {
        Optional<Endereco> optEndereco = this.getService().findById(id);

        return optEndereco.map(ResponseEntity::ok)
                          .orElse(ResponseEntity.notFound().build());
    }
}
