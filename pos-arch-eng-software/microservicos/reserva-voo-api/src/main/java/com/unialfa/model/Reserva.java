package com.unialfa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data_hora_inicio_Estadia")
    private LocalDateTime dataHotaInicioEstadia;

    @Column(name = "data_hora_fim_Estadia")
    private LocalDateTime dataHoraFimEstadia;

    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;
}
