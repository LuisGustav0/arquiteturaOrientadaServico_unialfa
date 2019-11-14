package com.unialfa.repository;

import com.unialfa.model.Cliente;
import com.unialfa.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
