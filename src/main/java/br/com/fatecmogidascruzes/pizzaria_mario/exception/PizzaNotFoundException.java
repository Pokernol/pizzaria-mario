package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class PizzaNotFoundException extends RuntimeException {
    public PizzaNotFoundException(String id) {
        super("Pizza não encontrada com o ID: " + id);
    }
}
