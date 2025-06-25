package br.com.fatecmogidascruzes.pizzaria_mario.service.impl;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;
import br.com.fatecmogidascruzes.pizzaria_mario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Arrays; // Importar Arrays

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        logger.info("Attempting to load user by username: {}", username);
        Optional<Usuario> usuarioOptional = usuarioRepository.findByUsername(username);

        if (usuarioOptional.isEmpty()) {
            logger.warn("User not found with username: {}", username);
            throw new UsernameNotFoundException("Usuário não encontrado com username: " + username);
        }

        Usuario usuario = usuarioOptional.get();
        logger.info("User found: {}. Password (hashed): {}", usuario.getUsername(), usuario.getPassword());
        // Garante que roles não é nulo antes de tentar criar o stream
        String[] roles = usuario.getRoles();
        return new User(usuario.getUsername(), usuario.getPassword(),
                roles == null ? Collections.emptyList() :
                Arrays.stream(roles)
                        .map(role -> new org.springframework.security.core.authority.SimpleGrantedAuthority("ROLE_" + role))
                        .collect(Collectors.toList()));
    }
}
