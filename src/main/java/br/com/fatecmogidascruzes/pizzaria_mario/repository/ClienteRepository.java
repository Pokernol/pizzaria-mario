package br.com.fatecmogidascruzes.pizzaria_mario.repository;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
