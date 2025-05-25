package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
