package br.com.fatecmogidascruzes.pizzaria_mario.protocols;

public interface Criptografador {

    public String criptografar(String textoLimpo);

    public Boolean validar(String textoLimpo, String textoCriptografado);
}
