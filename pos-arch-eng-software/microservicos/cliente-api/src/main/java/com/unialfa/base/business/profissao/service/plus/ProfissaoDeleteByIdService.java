package com.unialfa.base.business.profissao.service.plus;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProfissaoDeleteByIdService extends ProfissaoGetRepositoryService {

    @DeleteMapping("/{id}")
    default void deleteById(@PathVariable Long id) {
        this.getRepository().deleteById(id);
    }
}
