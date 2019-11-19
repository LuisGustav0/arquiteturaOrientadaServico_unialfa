package com.unialfa.base.business.estado;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Estado implements Serializable {

    @Id
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "sigla", nullable = false, length = 2)
    private String sigla;

    @Column(name = "nome", nullable = false, length = 120)
    private String nome;
}
