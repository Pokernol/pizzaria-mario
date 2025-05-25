package br.com.fatecmogidascruzes.pizzaria_mario.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {
    private Long id;
    private String nome;
    private String email;
    private String telefone;

    public String getNome(String nome) {
        return nome;
    }

    public String getEmail(String email) {
        return email;
    }

    public String getTelefone(String telefone) {
        return telefone;
    }

}
