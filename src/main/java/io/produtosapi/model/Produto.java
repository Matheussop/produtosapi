package io.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

// POJO - Plain Old Java Object
@Entity
@Table(name = "produto") // opcional caso o nome da tabela seja igual do nome da classe em minúsculo
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {

    @Id
    @Column(name = "id") // opcional caso o nome da coluna seja igual do nome do atributo
    private String id;
    private String nome;
    private String descricao;
    private Double preco;
}
