package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class PedidoNotFoundException extends RuntimeException {
    public PedidoNotFoundException(String id) {
        super("Pedido não encontrado com o ID: " + id);
    }
}
