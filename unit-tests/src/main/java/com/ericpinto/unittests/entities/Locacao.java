package com.ericpinto.unittests.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Locacao {

    private Usuario usuario;
    private Filme filme;
    private Date dataLocacao;
    private Date dataRetorno;
    private Double valor;
}
