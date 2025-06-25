package br.com.fatecmogidascruzes.pizzaria_mario.controller;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.SignUpDTO;
import br.com.fatecmogidascruzes.pizzaria_mario.exception.BusinessException;
import br.com.fatecmogidascruzes.pizzaria_mario.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@Controller
@AllArgsConstructor
public class CadastroController extends BaseController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/cadastro")
    public String cadastro(
            @RequestParam(value = "erro", required = false) String erro,
            @RequestParam(value = "message", required = false) String message,
            Model model) {
        if (erro != null) {
            String decodedMessage = URLDecoder.decode(message, StandardCharsets.ISO_8859_1);
            model.addAttribute("erro", true);
            model.addAttribute("message", decodedMessage);
        }
        if (message != null) {
            model.addAttribute("message", message);
        }
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastroPost(@ModelAttribute SignUpDTO input) {
        try {
            usuarioService.cadastrar(input);
            return "redirect:/login?message=Usuário cadastrado com sucesso";
        } catch (Throwable e) {
            String mensagemErro = e instanceof BusinessException ? e.getMessage() : "Houve um falha interna. Tente novamente mais tarde";
            return "redirect:/cadastro?erro=true&message=" + mensagemErro;
        }
    }
}
