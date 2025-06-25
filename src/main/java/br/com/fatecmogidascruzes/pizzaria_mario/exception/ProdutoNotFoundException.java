package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class ProdutoNotFoundException extends RuntimeException {
    public ProdutoNotFoundException(String id) {
        super("Produto não encontrado com o ID: " + id);
    }
}
