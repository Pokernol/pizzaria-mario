package br.com.fatecmogidascruzes.pizzaria_mario.protocols;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;

public interface SessionManager {

    public Void criarSessao(Usuario usuario);

    public Void destruirSessao(Usuario usuario);
}
