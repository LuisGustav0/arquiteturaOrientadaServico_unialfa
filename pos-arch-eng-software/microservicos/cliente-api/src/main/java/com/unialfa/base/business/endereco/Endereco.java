package com.unialfa.base.business.endereco;

import com.unialfa.base.business.cidade.Cidade;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 80)
    @Column(name = "logradouro", nullable = false, length = 80)
    private String logradouro;

    @Size(max = 20)
    @Column(name = "numero", length = 20)
    private String numero;

    @Size(max = 60)
    @Column(name = "complemento", length = 60)
    private String complemento;

    @NotNull
    @Size(max = 120)
    @Column(name = "bairro", nullable = false, length = 120)
    private String bairro;

    @Size(max = 11)
    @Column(name = "cep", nullable = false, length = 11)
    private String cep;

    @NotNull
    @ManyToOne
    private Cidade cidade;
}
