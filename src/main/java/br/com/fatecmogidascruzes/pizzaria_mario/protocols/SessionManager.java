package br.com.fatecmogidascruzes.pizzaria_mario.protocols;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;

public interface SessionManager {

    public void criarSessao(Usuario usuario);

    public void destruirSessao(Usuario usuario);

    public Boolean isUsuarioLogado();
}
