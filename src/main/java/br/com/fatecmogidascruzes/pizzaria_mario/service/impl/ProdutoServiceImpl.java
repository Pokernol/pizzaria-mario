package br.com.fatecmogidascruzes.pizzaria_mario.service.impl;

import br.com.fatecmogidascruzes.pizzaria_mario.exception.ProdutoNotFoundException;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Produto;
import br.com.fatecmogidascruzes.pizzaria_mario.repository.ProdutoRepository;
import br.com.fatecmogidascruzes.pizzaria_mario.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public Produto buscarPorId(String id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new ProdutoNotFoundException(id));
    }

    @Override
    public void deletar(String id) {
        if (!produtoRepository.existsById(id)) {
            throw new ProdutoNotFoundException(id);
        }
        produtoRepository.deleteById(id);
    }
}
