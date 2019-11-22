package com.unialfa.services;

import com.unialfa.model.ReservaVoo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class ReservaVooServiceTest {

    @Mock
    private ReservaVooService reservaVooService;

    @Test
    public void findByIdTest() {
        List<ReservaVoo> listaReservaVoo = new ArrayList<>();

        when(this.reservaVooService.findAll()).thenReturn(listaReservaVoo);
    }

    @Test
    public void findAllTest() {
        ReservaVoo reservaVoo = new ReservaVoo();
        reservaVoo.setId(1L);
        reservaVoo.setIdCliente(1L);

        when(this.reservaVooService.findById(reservaVoo.getId())).thenReturn(Optional.of(reservaVoo));
    }

    @Test
    public void saveTest() {
        ReservaVoo reservaVoo = new ReservaVoo();
        reservaVoo.setIdCliente(1L);

        ReservaVoo reservaVooSalvo = new ReservaVoo();
        reservaVoo.setId(1L);
        reservaVoo.setIdCliente(1L);

        when(this.reservaVooService.save(reservaVoo)).thenReturn(reservaVooSalvo);
    }
}
