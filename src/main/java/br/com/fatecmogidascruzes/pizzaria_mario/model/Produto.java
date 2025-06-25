package br.com.fatecmogidascruzes.pizzaria_mario.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "produtos")
public class Produto {

    @Id
    private String id;

    private String nome;
    private String descricao;
    private BigDecimal preco;
    private String categoria;
    private Boolean disponibilidade;
}
