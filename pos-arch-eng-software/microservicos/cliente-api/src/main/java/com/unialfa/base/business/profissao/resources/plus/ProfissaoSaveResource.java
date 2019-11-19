package com.unialfa.base.business.profissao.resources.plus;

import com.unialfa.base.business.profissao.Profissao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ProfissaoSaveResource extends ProfissaoGetServiceResource {

    @PostMapping
    default ResponseEntity<Profissao> save(@RequestBody Profissao profissao) {
        Profissao profissaoSalvo = this.getService().save(profissao);

        return ResponseEntity.status(HttpStatus.CREATED).body(profissaoSalvo);
    }
}
