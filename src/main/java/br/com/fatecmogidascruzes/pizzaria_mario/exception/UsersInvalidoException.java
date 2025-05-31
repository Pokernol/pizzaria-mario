package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class UsersInvalidoException extends BusinessException {
    public UsersInvalidoException(Long id) {super("User não encontrado com id: " + id) ;}
}
