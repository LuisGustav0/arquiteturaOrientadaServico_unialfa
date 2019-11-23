package com.unialfa.services;

import com.unialfa.api.cidade.CidadeApi;
import com.unialfa.api.cidade.model.Cidade;
import com.unialfa.api.cliente.ClienteApi;
import com.unialfa.api.cliente.model.Cliente;
import com.unialfa.model.ReservaVoo;
import com.unialfa.repository.ReservaVooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservaVooService {

    @Autowired
    private ReservaVooRepository reservaVooRepository;

    @Autowired
    private CidadeApi cidadeApi;

    @Autowired
    private ClienteApi clienteApi;

    public Optional<ReservaVoo> findById(Long id) {
        return this.reservaVooRepository.findById(id);
    }

    public List<ReservaVoo> findAll() {
        return this.reservaVooRepository.findAll();
    }

    public ReservaVoo save(ReservaVoo reservaVoo) {
        Cliente cliente = this.clienteApi.findById(reservaVoo.getIdCliente());
        Cidade cidadeOrigem = this.cidadeApi.findById(reservaVoo.getIdCidadeOrigem());
        Cidade cidadeDestino = this.cidadeApi.findById(reservaVoo.getIdCidadeDestino());

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Cidade origem: " + cidadeOrigem.getNome());
        System.out.println("Cidade destino: " + cidadeDestino.getNome());

        return this.reservaVooRepository.save(reservaVoo);
    }

    public void deleteById(Long id) {
        this.reservaVooRepository.deleteById(id);
    }

    public BigDecimal getValorTotalByIdCliente(Long idCliente) {
        List<ReservaVoo> listaReservaVoo = this.reservaVooRepository.findAll();
        listaReservaVoo = Optional.ofNullable(listaReservaVoo).orElse(new ArrayList<>());

        BigDecimal valorTotal = listaReservaVoo.stream()
                                               .filter(reservaVoo -> idCliente.equals(reservaVoo.getIdCliente()))
                                               .map(ReservaVoo::getPreco)
                                               .reduce(BigDecimal.ZERO, BigDecimal::add);

        return valorTotal;
    }
}
