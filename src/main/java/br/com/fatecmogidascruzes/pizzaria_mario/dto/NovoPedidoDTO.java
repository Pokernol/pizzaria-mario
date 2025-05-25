package br.com.fatecmogidascruzes.pizzaria_mario.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NovoPedidoDTO {
    private Long clienteId;
    private List<Long> pizzasIds;
}