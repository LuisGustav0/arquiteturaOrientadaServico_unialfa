package com.unialfa.base.business.cliente.respository;

import com.unialfa.base.business.cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
