package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class StatusPedidoInvalidoException extends BusinessException {
    public StatusPedidoInvalidoException(String status) {
        super("Status do pedido inválido: " + status);
    }
}
