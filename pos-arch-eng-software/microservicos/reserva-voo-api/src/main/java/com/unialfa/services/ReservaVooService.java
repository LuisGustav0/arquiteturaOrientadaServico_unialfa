package com.unialfa.services;

import com.unialfa.api.cidade.ClienteApi;
import com.unialfa.api.cidade.model.Cidade;
import com.unialfa.model.ReservaVoo;
import com.unialfa.repository.ReservaVooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaVooService {

    @Autowired
    private ReservaVooRepository reservaVooRepository;

    @Autowired
    private ClienteApi clienteApi;

    public Optional<ReservaVoo> findById(Long id) {
        return this.reservaVooRepository.findById(id);
    }

    public List<ReservaVoo> findAll() {
        return this.reservaVooRepository.findAll();
    }

    public ReservaVoo save(ReservaVoo reservaVoo) {
        Cidade cidadeOrigem = this.clienteApi.findById(reservaVoo.getCidadeOrigem().getId());
        Cidade cidadeDestino = this.clienteApi.findById(reservaVoo.getCidadeDestino().getId());

        reservaVoo.setCidadeOrigem(cidadeOrigem);
        reservaVoo.setCidadeDestino(cidadeDestino);

        return this.reservaVooRepository.save(reservaVoo);
    }

    public void deleteById(Long id) {
        this.reservaVooRepository.deleteById(id);
    }
}
