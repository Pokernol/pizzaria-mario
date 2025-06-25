package br.com.fatecmogidascruzes.pizzaria_mario.repository;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
