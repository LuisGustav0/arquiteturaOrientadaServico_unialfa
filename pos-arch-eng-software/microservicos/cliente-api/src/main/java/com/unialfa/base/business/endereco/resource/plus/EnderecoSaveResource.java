package com.unialfa.base.business.endereco.resource.plus;

import com.unialfa.base.business.endereco.Endereco;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface EnderecoSaveResource extends EnderecoGetServiceResource {

    @PostMapping
    default ResponseEntity<Endereco> save(@RequestBody Endereco endereco) {
        Endereco enderecoSalvo = this.getService().save(endereco);

        return ResponseEntity.status(HttpStatus.CREATED).body(enderecoSalvo);
    }
}
