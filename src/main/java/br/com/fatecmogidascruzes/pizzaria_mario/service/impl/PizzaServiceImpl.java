package br.com.fatecmogidascruzes.pizzaria_mario.service.impl;

import br.com.fatecmogidascruzes.pizzaria_mario.exception.PizzaNotFoundException;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Pizza;
import br.com.fatecmogidascruzes.pizzaria_mario.repository.PizzaRepository;
import br.com.fatecmogidascruzes.pizzaria_mario.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    @Override
    public List<Pizza> listarTodos() {
        return pizzaRepository.findAll();
    }

    @Override
    public Pizza salvar(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    @Override
    public Pizza buscarPorId(Long id) {
        return pizzaRepository.findById(id)
                .orElseThrow(() -> new PizzaNotFoundException(id));
    }

    @Override
    public void deletar(Long id) {
        if (!pizzaRepository.existsById(id)) {
            throw new PizzaNotFoundException(id);
        }
        pizzaRepository.deleteById(id);
    }
}
