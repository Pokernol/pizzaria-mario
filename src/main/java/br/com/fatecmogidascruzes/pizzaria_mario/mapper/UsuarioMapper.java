package br.com.fatecmogidascruzes.pizzaria_mario.mapper;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.UsuarioDTO;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "string")
public interface UsuarioMapper {
    UsuarioDTO toDTO(Usuario usuario);
    Usuario toEntity(UsuarioDTO dto);
}
