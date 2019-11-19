package com.unialfa.base.business.endereco.service.plus;

import com.unialfa.base.business.cliente.Cliente;
import com.unialfa.base.business.endereco.repository.EnderecoRepository;

public interface EnderecoSave extends EnderecoRepository {

    default Cliente save(Cliente cliente) {
        return this.save(cliente);
    }
}
