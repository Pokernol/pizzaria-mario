package br.com.fatecmogidascruzes.pizzaria_mario.infra.sessionmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Usuario;
import br.com.fatecmogidascruzes.pizzaria_mario.protocols.SessionManager;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Component()
public class HttpSessionManager implements SessionManager {

    @Autowired()
    private HttpServletRequest request;

    @Override
    public void criarSessao(Usuario usuario) {
        HttpSession session = request.getSession(true);
        session.setAttribute("usuarioLogado", usuario);
    }

    @Override
    public void destruirSessao(Usuario usuario) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
    }
}
