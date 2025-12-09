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

    @GetMapping("/buscar")
    public List<Produto> listarPorNome(@RequestParam("nome") String nome) {
        return produtoRepository.findByNome(nome);
    }


    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable("id") UUID id, @RequestBody Produto produto) {
        produto.setId(id);
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") UUID id) {
        produtoRepository.deleteById(id);
    }
}