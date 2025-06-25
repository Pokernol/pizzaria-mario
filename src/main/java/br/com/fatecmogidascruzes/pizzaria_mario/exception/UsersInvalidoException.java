package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class UsersInvalidoException extends RuntimeException {
    public UsersInvalidoException(String id) {
        super("Usuário não encontrado com o ID: " + id);
    }
}
