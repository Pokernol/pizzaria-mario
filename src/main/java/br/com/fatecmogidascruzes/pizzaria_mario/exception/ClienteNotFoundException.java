package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class ClienteNotFoundException extends RuntimeException {
    public ClienteNotFoundException(String id) {
        super("Cliente não encontrado com o ID: " + id);
    }
}
