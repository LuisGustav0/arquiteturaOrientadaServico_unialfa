package com.unialfa.base.business.cidade.respository;

import com.unialfa.base.business.cidade.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
