package com.unialfa.services;

import com.unialfa.model.Cliente;
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
    private ReservaVooRepository reservaVooRepository;

    @Test
    public void findByIdTest() {
        List<ReservaVoo> listaReservaVoo = new ArrayList<>();

        when(this.reservaVooRepository.findAll()).thenReturn(listaReservaVoo);

        this.reservaVooService.findAll();
    }

    @Test
    public void findAllTest() {
        Cliente cliente = new Cliente();
        cliente.setId(1L);

        ReservaVoo reservaVoo = new ReservaVoo();
        reservaVoo.setId(1L);
        reservaVoo.setCliente(cliente);

        when(this.reservaVooRepository.findById(reservaVoo.getId())).thenReturn(Optional.of(reservaVoo));

        this.reservaVooService.findById(reservaVoo.getId());
    }

    @Test
    public void saveTest() {
        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Luis Gustavo");

        ReservaVoo reservaVoo = new ReservaVoo();
        reservaVoo.setCliente(cliente);
        reservaVoo.setCidadeOrigem("Goiania");
        reservaVoo.setCidadeDestino("Uberlandia");

        ReservaVoo reservaVooSalvo = new ReservaVoo();
        reservaVooSalvo.setCliente(cliente);
        reservaVooSalvo.setCidadeOrigem("Goiania");
        reservaVooSalvo.setCidadeDestino("Uberlandia");

        when(this.reservaVooRepository.save(reservaVoo)).thenReturn(reservaVooSalvo);

        this.reservaVooService.save(reservaVoo);
    }
}
