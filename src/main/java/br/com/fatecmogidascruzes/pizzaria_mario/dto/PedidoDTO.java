package br.com.fatecmogidascruzes.pizzaria_mario.dto;

import br.com.fatecmogidascruzes.pizzaria_mario.model.StatusPedido;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
