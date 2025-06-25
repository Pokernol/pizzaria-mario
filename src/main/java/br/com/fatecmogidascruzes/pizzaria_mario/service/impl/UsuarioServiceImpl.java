package br.com.fatecmogidascruzes.pizzaria_mario.service.impl;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.SignUpDTO;
import br.com.fatecmogidascruzes.pizzaria_mario.exception.BusinessException;
import br.com.fatecmogidascruzes.pizzaria_mario.exception.UsersInvalidoException;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;
import br.com.fatecmogidascruzes.pizzaria_mario.protocols.Criptografador;
import br.com.fatecmogidascruzes.pizzaria_mario.repository.UsuarioRepository;
import br.com.fatecmogidascruzes.pizzaria_mario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuariosRepository;

    @Autowired
    private Criptografador criptografador;

    @Override
    public List<Usuario> listaTodos() { return usuariosRepository.findAll(); }

    @Override
    public Usuario salvar(Usuario usuario) { return usuariosRepository.save(usuario); }

    @Override
    public Usuario buscaPorId(String id) {
        return usuariosRepository.findById(id)
                .orElseThrow(() -> new UsersInvalidoException(id));
    }

    @Override
    public void deletar(String id){
        if (!usuariosRepository.existsById(id)){
            throw new UsersInvalidoException(id);
        }
        usuariosRepository.deleteById(id);
    }

    @Override
    public Optional<Usuario> buscarPorUsuario(String username) {
        return this.usuariosRepository.findByUsername(username);
    }

    @Override
    public void cadastrar(SignUpDTO input) {
        String email = (input.getEmail() == null || input.getEmail().isBlank()) ? input.getUsername() : input.getEmail();

        if (usuariosRepository.existsByUsername(input.getUsername())) {
            throw new BusinessException("Usuário já existente");
        }
        if (usuariosRepository.existsByEmail(email)) {
            throw new BusinessException("Email já cadastrado");
        }

        Usuario novo = new Usuario();
        novo.setUsername(input.getUsername());
        novo.setEmail(email);
        novo.setNome(input.getNome());
        novo.setPassword(criptografador.criptografar(input.getPassword()));

        usuariosRepository.save(novo);
    }
}
