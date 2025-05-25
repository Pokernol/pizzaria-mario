package br.com.fatecmogidascruzes.pizzaria_mario.facade;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Pizza;
import br.com.fatecmogidascruzes.pizzaria_mario.service.PizzaService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PizzaFacade {

    private final PizzaService pizzaService;

    public PizzaFacade(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    public Pizza salvarPizza(Pizza pizza) {
        // regras específicas aqui
        return pizzaService.salvar(pizza);
    }

    public List<Pizza> listarPizzas() {
        return pizzaService.listarTodos();
    }

    public Pizza buscarPorId(Long id) {
        return pizzaService.buscarPorId(id);
    }

    public void deletarPizza(Long id) {
        pizzaService.deletar(id);
    }
}
