package com.unialfa.services;

import com.unialfa.model.Hotel;
import com.unialfa.model.Reserva;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class ReservaVooServiceTest {

    private static Hotel salvarHotel(EntityManager manager) {
        Hotel hotelSalvo = manager.find(Hotel.class, 1L);
        if (hotelSalvo != null) {
            return hotelSalvo;
        }

        manager.getTransaction().begin();

        Hotel hotel = new Hotel();
        hotel.setNome("Hotel 01");
        hotel = manager.merge(hotel);

        manager.getTransaction().commit();

        return hotel;
    }

    private static Reserva getReserva(Hotel hotel, int days) {
        Reserva reserva = new Reserva();
        reserva.setDataHotaInicioEstadia(LocalDateTime.now());
        reserva.setDataHoraFimEstadia(LocalDateTime.now().plusDays(days));
        reserva.setPreco(new BigDecimal("1.450"));
        reserva.setHotel(hotel);

        return reserva;
    }

    private static void salvarHotel(EntityManager manager, Reserva reserva) {
        manager.clear();
        manager.getTransaction().begin();

        manager.persist(reserva);

        manager.getTransaction().commit();
    }

    private static void salvarListaReserva(Hotel hotel, EntityManager manager) {
        Reserva reservaSalva = manager.find(Reserva.class, 1L);
        if (reservaSalva != null) {
            return;
        }

        Reserva reserva01 = getReserva(hotel, 5);
        Reserva reserva02 = getReserva(hotel, 10);
        Reserva reserva03 = getReserva(hotel, 15);
        Reserva reserva04 = getReserva(hotel, 20);
        Reserva reserva05 = getReserva(hotel, 25);

        Arrays.asList(reserva01, reserva02, reserva03, reserva04, reserva05)
              .forEach(reserva -> {
                  salvarHotel(manager, reserva);
              });
    }

    public static void main(String args[]) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Projetos-PU");
        EntityManager manager = factory.createEntityManager();

        System.out.println("----------------------------------------------------------------");

        Hotel hotel = salvarHotel(manager);

        salvarListaReserva(hotel, manager);

        manager.close();
        factory.close();
    }
}
