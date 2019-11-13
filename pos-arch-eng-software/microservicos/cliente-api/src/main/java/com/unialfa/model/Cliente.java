package com.unialfa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    @ManyToOne
    @JoinTable(name = "profissao_id")
    private Profissao profissao;
    @ManyToMany
    @JoinTable(name = "endereco_id")
    private List<Endereco> listaEndereco;
}
