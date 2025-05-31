package br.com.fatecmogidascruzes.pizzaria_mario.dto;

import lombok.*;

@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private String username;
    private String email;
    private String nome;
    private String password;
}
