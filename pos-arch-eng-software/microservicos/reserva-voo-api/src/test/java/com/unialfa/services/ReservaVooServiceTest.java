package com.unialfa.services;

import com.unialfa.api.cidade.CidadeApi;
import com.unialfa.api.cidade.model.Cidade;
import com.unialfa.api.cliente.ClienteApi;
import com.unialfa.api.cliente.model.Cliente;
import com.unialfa.model.ReservaVoo;
import com.unialfa.repository.ReservaVooRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class ReservaVooServiceTest {

    @InjectMocks
    private ReservaVooService reservaVooService;

    @Mock
    private ClienteApi clienteApi;

    @Mock
    private CidadeApi cidadeApi;

    @Mock
    private ReservaVooRepository reservaVooRepository;

    @Test
    public void findByIdTest() {
        List<ReservaVoo> listaReservaVoo = new ArrayList<>();

        when(this.reservaVooRepository.findAll()).thenReturn(listaReservaVoo);

        this.reservaVooService.findAll();
    }

    @Test
    public void findAllTest() {
        ReservaVoo reservaVoo = new ReservaVoo();
        reservaVoo.setId(1L);
        reservaVoo.setIdCliente(1L);

        when(this.reservaVooRepository.findById(reservaVoo.getId())).thenReturn(Optional.of(reservaVoo));

        this.reservaVooService.findById(reservaVoo.getId());
    }

    @Test
    public void saveTest() {
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Luis Gustavo");

        Cidade cidadeOrigem = new Cidade();
        cidadeOrigem.setId(1L);
        cidadeOrigem.setNome("Goiania");

        Cidade cidadeDestino = new Cidade();
        cidadeDestino.setId(2L);
        cidadeDestino.setNome("Uberlândia");

        ReservaVoo reservaVoo = new ReservaVoo();
        reservaVoo.setIdCliente(1L);
        reservaVoo.setIdCidadeOrigem(1L);
        reservaVoo.setIdCidadeDestino(2L);

        ReservaVoo reservaVooSalvo = new ReservaVoo();
        reservaVooSalvo.setIdCliente(1L);
        reservaVooSalvo.setIdCidadeOrigem(1L);
        reservaVooSalvo.setIdCidadeDestino(2L);

        when(this.clienteApi.findById(reservaVoo.getIdCliente())).thenReturn(cliente);
        when(this.cidadeApi.findById(reservaVoo.getIdCidadeOrigem())).thenReturn(cidadeOrigem);
        when(this.cidadeApi.findById(reservaVoo.getIdCidadeDestino())).thenReturn(cidadeDestino);
        when(this.reservaVooRepository.save(reservaVoo)).thenReturn(reservaVooSalvo);

        this.reservaVooService.save(reservaVoo);
    }
}
