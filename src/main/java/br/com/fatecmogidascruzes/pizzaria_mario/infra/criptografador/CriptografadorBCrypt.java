package br.com.fatecmogidascruzes.pizzaria_mario.infra.criptografador;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import br.com.fatecmogidascruzes.pizzaria_mario.protocols.Criptografador;

@Component()
public class CriptografadorBCrypt implements Criptografador {

    private final PasswordEncoder passwordEncoder;

    public CriptografadorBCrypt() {
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public String criptografar(String textoLimpo) {
        return this.passwordEncoder.encode(textoLimpo);
    }

    @Override
    public Boolean validar(String textoLimpo, String textoCriptografado) {
        return this.passwordEncoder.matches(textoLimpo, textoCriptografado);
    }

}
