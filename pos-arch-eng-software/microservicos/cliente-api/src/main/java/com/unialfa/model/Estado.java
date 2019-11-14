package com.unialfa.model;

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
    private String sigla;
    private String nome;
}
