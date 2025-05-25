package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class ClienteNotFoundException extends BusinessException {
    public ClienteNotFoundException(Long id) {
        super("Cliente não encontrado com id: " + id);
    }
}

