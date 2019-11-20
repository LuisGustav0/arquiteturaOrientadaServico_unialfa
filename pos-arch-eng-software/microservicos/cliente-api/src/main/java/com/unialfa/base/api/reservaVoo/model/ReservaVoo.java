package com.unialfa.base.api.reservaVoo.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class ReservaVoo implements Serializable {

    private Long id;
    private Long idCliente;
    private Long idCidadeOrigem;
    private Long idCidadeDestino;
    private BigDecimal preco;
    private LocalDate data;
    private String horaEntrada;
    private String horaSaida;
}
