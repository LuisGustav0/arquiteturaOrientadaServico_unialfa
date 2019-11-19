package com.unialfa.model;

import com.unialfa.api.cidade.Cidade;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "reserva_voo")
public class ReservaVoo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Cidade cidadeOrigem;
    private Cidade cidadeDestino;
    private BigDecimal preco;
    private LocalDate data;
    private String horaEntrada;
    private String horaSaida;
}
