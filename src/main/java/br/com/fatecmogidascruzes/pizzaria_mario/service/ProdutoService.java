package br.com.fatecmogidascruzes.pizzaria_mario.service;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Produto;

import java.util.List;

public interface ProdutoService {
    List<Produto> listarTodos();
    Produto buscarPorId(String id);
    Produto salvar(Produto produto);
    void deletar(String id);
}
