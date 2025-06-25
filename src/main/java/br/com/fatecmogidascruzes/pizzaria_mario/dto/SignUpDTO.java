package br.com.fatecmogidascruzes.pizzaria_mario.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignUpDTO {
    @NonNull
    private String username;

    @NonNull
    private String email;

    @NonNull
    private String nome;

    @NonNull
    private String password;
}
