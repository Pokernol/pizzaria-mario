package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class PedidoNotFoundException extends BusinessException {
    public PedidoNotFoundException(Long id) {
        super("Pedido não encontrado com id: " + id);
    }
}
