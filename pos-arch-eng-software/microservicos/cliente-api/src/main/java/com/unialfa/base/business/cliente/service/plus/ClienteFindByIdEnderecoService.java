package com.unialfa.base.business.cliente.service.plus;

import com.unialfa.base.business.cliente.Cliente;
import com.unialfa.base.business.endereco.Endereco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public interface ClienteFindByIdEnderecoService extends ClienteGetRepositoryService {

    default Cliente findByIdEndereco(Long id) {
        Optional<Cliente> optCliente = this.getRepository().findById(id);
        Cliente cliente = optCliente.orElse(new Cliente());

        List<Endereco> listaEndereco = Optional.ofNullable(cliente)
                                               .map(Cliente::getListaEndereco)
                                               .orElse(new ArrayList<>());

        if(listaEndereco.size() > 0) {
            Endereco endereco = listaEndereco.get(0);
            cliente.setListaEndereco(Arrays.asList(endereco));
        }

        return cliente;
    }
}
