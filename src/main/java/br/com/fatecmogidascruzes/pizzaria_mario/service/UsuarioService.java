package br.com.fatecmogidascruzes.pizzaria_mario.service;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> listaTodos();
    Usuario buscaPorId(Long id);
    Usuario salvar(Usuario user);
    void deletar(Long id);
}
