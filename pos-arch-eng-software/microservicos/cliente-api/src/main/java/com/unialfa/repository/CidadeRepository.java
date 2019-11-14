package com.unialfa.repository;

import com.unialfa.model.Cidade;
import com.unialfa.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
