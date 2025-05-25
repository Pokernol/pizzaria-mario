package br.com.fatecmogidascruzes.pizzaria_mario.mapper;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.PizzaDTO;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Pizza;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PizzaMapper {
    PizzaDTO toDTO(Pizza pizza);
    Pizza toEntity(PizzaDTO pizzaDTO);
}
