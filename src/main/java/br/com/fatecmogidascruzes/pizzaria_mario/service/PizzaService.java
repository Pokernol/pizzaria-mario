package br.com.fatecmogidascruzes.pizzaria_mario.service;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Pizza;

import java.util.List;

public interface PizzaService {
    List<Pizza> listarTodos();
    Pizza buscarPorId(String id);
    Pizza salvar(Pizza pizza);
    void deletar(String id);
}
