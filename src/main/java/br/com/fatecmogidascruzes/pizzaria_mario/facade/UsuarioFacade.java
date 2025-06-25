package br.com.fatecmogidascruzes.pizzaria_mario.facade;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;
import br.com.fatecmogidascruzes.pizzaria_mario.service.UsuarioService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioFacade {

    private final UsuarioService usuarioService;

    public UsuarioFacade(UsuarioService usuarioService) { this.usuarioService = usuarioService; }

    public Usuario salvarUsers(Usuario usuario){
        return usuarioService.salvar(usuario);
    }

    public List<Usuario> listarUsers() { return usuarioService.listaTodos(); }

    public Usuario buscarUsuarioPorId(String id) {
        return usuarioService.buscaPorId(id);
    }

    public void deletarUsuario(String id) {
        usuarioService.deletar(id);
    }
}
