package br.com.fatecmogidascruzes.pizzaria_mario.repository;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
