package br.com.fatecmogidascruzes.pizzaria_mario.mapper;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.ClienteDTO;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    ClienteDTO toDTO(Cliente cliente);
    Cliente toEntity(ClienteDTO clienteDTO);
}
