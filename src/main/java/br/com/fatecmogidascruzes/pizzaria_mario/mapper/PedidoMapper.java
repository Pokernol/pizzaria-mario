package br.com.fatecmogidascruzes.pizzaria_mario.mapper;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.PedidoDTO;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Pedido;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ClienteMapper.class, PizzaMapper.class})
public interface PedidoMapper {
    PedidoDTO toDTO(Pedido pedido);
    Pedido toEntity(PedidoDTO pedidoDTO);
}
