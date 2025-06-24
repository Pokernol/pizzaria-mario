package br.com.fatecmogidascruzes.pizzaria_mario.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NovoPedidoDTO {
    private Long clienteId;
    private List<Long> pizzasIds;
}