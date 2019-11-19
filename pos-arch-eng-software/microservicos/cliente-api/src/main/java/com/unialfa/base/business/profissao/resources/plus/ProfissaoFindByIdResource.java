package com.unialfa.base.business.profissao.resources.plus;

import com.unialfa.base.business.profissao.Profissao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface ProfissaoFindByIdResource extends ProfissaoGetServiceResource {

    @GetMapping("/{id}")
    default ResponseEntity<Profissao> findById(@PathVariable Long id) {
        Optional<Profissao> optProfissao = this.getService().findById(id);

        return optProfissao.map(ResponseEntity::ok)
                           .orElse(ResponseEntity.notFound().build());
    }
}
