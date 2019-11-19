package com.unialfa.base.business.cidade;

import com.unialfa.base.business.estado.Estado;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@Entity
public class Cidade implements Serializable {

    @Id
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false, length = 120)
    private String nome;

    @ManyToOne
    private Estado estado;
}
