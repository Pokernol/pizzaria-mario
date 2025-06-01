package br.com.fatecmogidascruzes.pizzaria_mario.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.SignInDTO;
import br.com.fatecmogidascruzes.pizzaria_mario.exception.BusinessException;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;
import br.com.fatecmogidascruzes.pizzaria_mario.protocols.Criptografador;
import br.com.fatecmogidascruzes.pizzaria_mario.protocols.SessionManager;
import br.com.fatecmogidascruzes.pizzaria_mario.service.LoginService;
import br.com.fatecmogidascruzes.pizzaria_mario.service.UsuarioService;

@Service()
public class LoginServiceImpl implements LoginService {
    @Autowired()
    private UsuarioService usuariosService;

    @Autowired()
    private SessionManager sessionManager;

    @Autowired()
    private Criptografador criptografador;

    private Boolean validatePassword(Usuario usuario, String password) {
        return this.criptografador.validar(password, usuario.getPassword());
    }

    @Override()
    public void fazerLogin(SignInDTO input) {
        Optional<Usuario> usuario = this.usuariosService.buscarPorUsuario(input.getUsername());
    
        if(!usuario.isPresent() || !this.validatePassword(usuario.get(), input.getPassword())) {
            throw new BusinessException("Usuario ou senha invalidos");
        }

        this.sessionManager.criarSessao(usuario.get());
    }
}
