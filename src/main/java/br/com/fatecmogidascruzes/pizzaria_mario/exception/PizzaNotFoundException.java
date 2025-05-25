package br.com.fatecmogidascruzes.pizzaria_mario.exception;

public class PizzaNotFoundException extends BusinessException {
    public PizzaNotFoundException(Long id) {
        super("Pizza não encontrada com id: " + id);
    }
}
