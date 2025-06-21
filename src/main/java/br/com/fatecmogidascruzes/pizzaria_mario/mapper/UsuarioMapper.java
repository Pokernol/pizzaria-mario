package br.com.fatecmogidascruzes.pizzaria_mario.mapper;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.UsuarioDTO;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioDTO toDTO(Usuario usuario);

    @Mapping(target = "id", ignore = true)
    Usuario toEntity(UsuarioDTO dto);
}