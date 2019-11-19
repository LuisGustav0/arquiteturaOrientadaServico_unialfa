package com.unialfa.api.cliente.model;

import com.unialfa.api.endereco.Endereco;
import com.unialfa.api.profissao.Profissao;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Cliente implements Serializable {

    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private Profissao profissao;
    private List<Endereco> listaEndereco;
}
