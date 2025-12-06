package io.produtosapi.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// POJO - Plain Old Java Object
@Setter
@Getter
@ToString
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private double preco;
}
