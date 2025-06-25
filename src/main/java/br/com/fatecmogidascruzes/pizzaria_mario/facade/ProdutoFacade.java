package br.com.fatecmogidascruzes.pizzaria_mario.facade;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Produto;
import br.com.fatecmogidascruzes.pizzaria_mario.service.ProdutoService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoFacade {

    private final ProdutoService produtoService;

    public ProdutoFacade(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    public Produto salvarProduto(Produto produto) {
        return produtoService.salvar(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoService.listarTodos();
    }

    public Produto buscarProdutoPorId(String id) {
        return produtoService.buscarPorId(id);
    }

    public void deletarProduto(String id) {
        produtoService.deletar(id);
    }
}
