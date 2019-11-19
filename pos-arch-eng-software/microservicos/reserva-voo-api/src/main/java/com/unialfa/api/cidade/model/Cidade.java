package com.unialfa.api.cidade.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Cidade implements Serializable {

    private Long id;
    private String nome;
    private Estado estado;
}
