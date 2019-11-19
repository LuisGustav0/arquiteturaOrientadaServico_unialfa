package com.unialfa.base.business.profissao.respository;

import com.unialfa.base.business.profissao.Profissao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissaoRepository extends JpaRepository<Profissao, Long> {
}
