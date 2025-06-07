package br.com.fatecmogidascruzes.pizzaria_mario.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cliente cliente;

    @ManyToMany
    private List<Pizza> pizzas;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    private Double valorTotal;

    private LocalDateTime dataHora;
}
