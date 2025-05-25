package br.com.fatecmogidascruzes.pizzaria_mario.repository;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
