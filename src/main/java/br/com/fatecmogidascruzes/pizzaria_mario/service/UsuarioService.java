package br.com.fatecmogidascruzes.pizzaria_mario.service;

import java.util.List;
import java.util.Optional;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;

public interface UsuarioService {
    List<Usuario> listaTodos();
    Usuario buscaPorId(Long id);
    Optional<Usuario> buscarPorUsuario(String username);
    Usuario salvar(Usuario user);
    void deletar(Long id);
}
