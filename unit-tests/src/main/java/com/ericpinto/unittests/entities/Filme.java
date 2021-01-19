package com.ericpinto.unittests.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Filme {

    private String nome;
    private Integer estoque;
    private Double precoLocacao;

}
