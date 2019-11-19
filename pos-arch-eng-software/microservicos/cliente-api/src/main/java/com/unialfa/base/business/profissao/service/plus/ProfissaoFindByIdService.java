package com.unialfa.base.business.profissao.service.plus;

import com.unialfa.base.business.profissao.Profissao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface ProfissaoFindByIdService extends ProfissaoGetRepositoryService {

    @GetMapping("/{id}")
    default Optional<Profissao> findById(@PathVariable Long id) {
        return this.getRepository().findById(id);
    }
}
