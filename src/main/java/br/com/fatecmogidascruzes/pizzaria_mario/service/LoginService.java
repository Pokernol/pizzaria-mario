package br.com.fatecmogidascruzes.pizzaria_mario.service;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.SignInDTO;

public interface LoginService {
    public void fazerLogin(SignInDTO input);
}
