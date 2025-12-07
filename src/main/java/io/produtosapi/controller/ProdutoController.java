package io.produtosapi.controller;

import io.produtosapi.model.Produto;
import io.produtosapi.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Salvando produto... " + produto);

        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable UUID id) {
        return produtoRepository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }
}