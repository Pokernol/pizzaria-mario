package br.com.fatecmogidascruzes.pizzaria_mario.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatecmogidascruzes.pizzaria_mario.exception.UsersInvalidoException;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;
import br.com.fatecmogidascruzes.pizzaria_mario.repository.UsuarioRepository;
import br.com.fatecmogidascruzes.pizzaria_mario.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuariosRepository;

    @Override
    public List<Usuario> listaTodos() { return usuariosRepository.findAll(); }

    @Override
    public Usuario salvar(Usuario usuario) { return usuariosRepository.save(usuario); }

    @Override
    public Usuario buscaPorId(Long id) {
        return usuariosRepository.findById(id)
                .orElseThrow(() -> new UsersInvalidoException(id));
    }

    @Override
    public void deletar(Long id){
        if (!usuariosRepository.existsById(id)){
            throw new UsersInvalidoException(id);
        }
        usuariosRepository.deleteById(id);
    }

    @Override
    public Optional<Usuario> buscarPorUsuario(String username) {
        return this.usuariosRepository.findByUsername(username);
    }

}
