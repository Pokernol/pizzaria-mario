package br.com.fatecmogidascruzes.pizzaria_mario.dto;

import lombok.Data;
import lombok.NonNull;

@Data()
public class SignInDTO {

    @NonNull()
    private String username;

    @NonNull()
    private String password;
}
