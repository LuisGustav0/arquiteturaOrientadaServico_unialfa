package com.unialfa.api.endereco;

import com.unialfa.api.cidade.model.Cidade;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Endereco implements Serializable {

    private Long id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private Cidade cidade;
}
