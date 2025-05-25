package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class PedidoInvalidoException extends BusinessException {
    public PedidoInvalidoException(String message) {
        super("Pedido inválido: " + message);
    }
}
