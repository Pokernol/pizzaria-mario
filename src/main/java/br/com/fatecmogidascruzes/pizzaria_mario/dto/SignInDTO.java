package br.com.fatecmogidascruzes.pizzaria_mario.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SignInDTO {

    @NonNull
    private String username;

    @NonNull
    private String password;

}
