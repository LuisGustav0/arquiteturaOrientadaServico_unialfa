package com.unialfa.api.cidade;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Estado implements Serializable {

    private Long id;
    private String sigla;
    private String nome;
}
