package br.com.fatecmogidascruzes.pizzaria_mario.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PizzaDTO {
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;

    //getters

    public Long getId() {
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }
}

