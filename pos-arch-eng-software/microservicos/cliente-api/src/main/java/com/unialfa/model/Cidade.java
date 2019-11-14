package com.unialfa.model;

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
    private String nome;
    @ManyToOne
    private Estado estado;
}
