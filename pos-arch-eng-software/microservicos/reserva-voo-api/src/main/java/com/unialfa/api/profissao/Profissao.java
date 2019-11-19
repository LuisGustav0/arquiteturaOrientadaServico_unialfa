package com.unialfa.api.profissao;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Profissao implements Serializable {

    private Long id;
    private String descricao;
}
