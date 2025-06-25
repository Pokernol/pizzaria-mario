package br.com.fatecmogidascruzes.pizzaria_mario.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "pizzas")
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {

    @Id
    private String id;

    private String nome;
    private String descricao;
    private Double preco;
}
