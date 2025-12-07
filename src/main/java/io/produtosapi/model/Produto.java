package io.produtosapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

// POJO - Plain Old Java Object
@Entity
@Table(name = "produto") // opcional caso o nome da tabela seja igual do nome da classe em minúsculo
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id") // opcional caso o nome da coluna seja igual do nome do atributo
    private UUID id;
    private String nome;
    private String descricao;
    private Double preco;
}
