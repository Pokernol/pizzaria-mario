package br.com.fatecmogidascruzes.pizzaria_mario.controller;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.SignInDTO;
import br.com.fatecmogidascruzes.pizzaria_mario.exception.BusinessException;
import br.com.fatecmogidascruzes.pizzaria_mario.service.LoginService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor()
public class LoginController {

    @Autowired()
    private LoginService loginService;

    @GetMapping("/login")
    public String login(
        @RequestParam(required = false) String erro,
        @RequestParam(required = false) String message,
        Model model
    ) {
        if (erro != null) {
            String decodedMessage = URLDecoder.decode(message, StandardCharsets.ISO_8859_1);
            model.addAttribute("erro", true);
            model.addAttribute("message", decodedMessage);
        }

        return "login";
    }

    @PostMapping("/login")
    public String loginPost(
            @ModelAttribute() SignInDTO input
    ) {
        try {
            this.loginService.fazerLogin(input);
            return "redirect:/";
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            String mensagemErro = e instanceof BusinessException ? e.getMessage() : "Houve um falha interna. Tente novamente mais tarde";
            return "redirect:/login?erro=true&message=" + mensagemErro;
        }
    }
}
