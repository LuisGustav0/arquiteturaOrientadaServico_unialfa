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
        BigDecimal preco = new BigDecimal(120);
        preco = preco.multiply(new BigDecimal(days));

        Reserva reserva = new Reserva();
        reserva.setDataHotaInicioEstadia(LocalDateTime.now());
        reserva.setDataHoraFimEstadia(LocalDateTime.now().plusDays(days));
        reserva.setPreco(preco);
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

        for (int i = 1; i <= 10000; i++) {
            Reserva reserva = getReserva(hotel, i);
            salvarHotel(manager, reserva);
        }
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
