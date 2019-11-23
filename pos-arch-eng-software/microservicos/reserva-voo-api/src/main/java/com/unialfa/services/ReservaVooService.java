package com.unialfa.services;

import com.unialfa.model.Cliente;
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
    private ClienteService clienteService;

    public Optional<ReservaVoo> findById(Long id) {
        return this.reservaVooRepository.findById(id);
    }

    public List<ReservaVoo> findAll() {
        return this.reservaVooRepository.findAll();
    }

    public ReservaVoo save(ReservaVoo reservaVoo) {
        Cliente cliente = this.clienteService.save(reservaVoo.getCliente());

        reservaVoo.setCliente(cliente);

        return this.reservaVooRepository.save(reservaVoo);
    }

    public void deleteById(Long id) {
        this.reservaVooRepository.deleteById(id);
    }

    private Long getIdClientePorReserva(ReservaVoo reservaVoo) {
        return Optional.ofNullable(reservaVoo)
                       .map(ReservaVoo::getCliente)
                       .map(Cliente::getId)
                       .orElse(0L);
    }

    private boolean filtroPorIdCliente(ReservaVoo reservaVoo, Long idCliente) {
        Long idClienteReserva = getIdClientePorReserva(reservaVoo);

        return idClienteReserva.equals(idCliente);
    }

    public BigDecimal getValorTotalByIdCliente(Long idCliente) {
        List<ReservaVoo> listaReservaVoo = this.reservaVooRepository.findAll();
        listaReservaVoo = Optional.ofNullable(listaReservaVoo).orElse(new ArrayList<>());

        BigDecimal valorTotal = listaReservaVoo.stream()
                                               .filter(reservaVoo -> filtroPorIdCliente(reservaVoo, idCliente))
                                               .map(ReservaVoo::getPreco)
                                               .reduce(BigDecimal.ZERO, BigDecimal::add);

        return valorTotal;
    }
}
