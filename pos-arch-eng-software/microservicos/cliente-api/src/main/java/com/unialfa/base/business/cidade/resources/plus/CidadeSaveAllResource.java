package com.unialfa.base.business.cidade.resources.plus;

import com.unialfa.base.business.cidade.Cidade;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CidadeSaveAllResource extends CidadeGetServiceResource {

    @PostMapping
    default ResponseEntity<List<Cidade>> saveAll(@RequestBody List<Cidade> listaCidade) {
        List<Cidade> listaCidadeSalvo = this.getService().saveAll(listaCidade);

        return ResponseEntity.status(HttpStatus.CREATED).body(listaCidadeSalvo);
    }
}
