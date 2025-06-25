package br.com.fatecmogidascruzes.pizzaria_mario.infra.criptografador;

import br.com.fatecmogidascruzes.pizzaria_mario.protocols.Criptografador;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component()
public class CriptografadorBCrypt implements Criptografador {

    private static final Logger logger = LoggerFactory.getLogger(CriptografadorBCrypt.class);

    private final PasswordEncoder passwordEncoder;

    public CriptografadorBCrypt() {
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public String criptografar(String textoLimpo) {
        String hashedText = this.passwordEncoder.encode(textoLimpo);
        logger.info("Criptografando: '{}' para '{}'", textoLimpo, hashedText);
        return hashedText;
    }

    @Override
    public Boolean validar(String textoLimpo, String textoCriptografado) {
        boolean matches = this.passwordEncoder.matches(textoLimpo, textoCriptografado);
        logger.info("Validando: textoLimpo='{}', textoCriptografado='{}', resultado={}", textoLimpo, textoCriptografado, matches);
        return matches;
    }

}
