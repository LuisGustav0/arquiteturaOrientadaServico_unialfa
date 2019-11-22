package com.unialfa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
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

    @Column(name = "id_cliente", nullable = false)
    private Long idCliente;

    @Column(name = "id_cidade_origem", nullable = false)
    private Long idCidadeOrigem;

    @Column(name = "id_cidade_destino", nullable = false)
    private Long idCidadeDestino;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @Column(name = "data", nullable = false, length = 120)
    private LocalDate data;

    @Column(name = "hora_entrada", nullable = false, length = 4)
    private String horaEntrada;

    @Column(name = "hora_saida", nullable = false, length = 4)
    private String horaSaida;
}
