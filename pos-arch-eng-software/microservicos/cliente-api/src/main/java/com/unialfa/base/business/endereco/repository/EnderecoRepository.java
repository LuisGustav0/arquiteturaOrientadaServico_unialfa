package com.unialfa.base.business.endereco.repository;

import com.unialfa.base.business.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
