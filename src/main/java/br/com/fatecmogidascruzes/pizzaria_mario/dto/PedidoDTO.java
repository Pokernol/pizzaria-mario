package br.com.fatecmogidascruzes.pizzaria_mario.dto;

import br.com.fatecmogidascruzes.pizzaria_mario.model.StatusPedido;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {
    private Long id;
    private ClienteDTO cliente;
    private List<PizzaDTO> pizzas;
    private StatusPedido status;
    private Double valorTotal;
    private LocalDateTime dataHora;

    public Long getId() {
        return id;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public List<PizzaDTO> getPizzas() {
        return pizzas;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

}
