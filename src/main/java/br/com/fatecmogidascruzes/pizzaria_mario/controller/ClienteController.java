package br.com.fatecmogidascruzes.pizzaria_mario.controller;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.ClienteDTO;
import br.com.fatecmogidascruzes.pizzaria_mario.facade.ClienteFacade;
import br.com.fatecmogidascruzes.pizzaria_mario.mapper.ClienteMapper;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteFacade clienteFacade;
    private final ClienteMapper clienteMapper;

    public ClienteController(ClienteFacade clienteFacade, ClienteMapper clienteMapper) {
        this.clienteFacade = clienteFacade;
        this.clienteMapper = clienteMapper;
    }

    @GetMapping("/novo")
    public String novoCliente(Model model) {
        model.addAttribute("cliente", new ClienteDTO());
        return "cliente/cliente-form";
    }

    @PostMapping("/salvar")
    public String salvarCliente(@ModelAttribute ClienteDTO clienteDTO) {
        Cliente cliente = clienteMapper.toEntity(clienteDTO);
        clienteFacade.salvarCliente(cliente);
        return "redirect:/clientes/lista";
    }

    @GetMapping("/lista")
    public String listarClientes(Model model) {
        List<ClienteDTO> clientes = clienteFacade.listarClientes()
                .stream()
                .map(clienteMapper::toDTO)
                .collect(Collectors.toList());
        model.addAttribute("clientes", clientes);
        return "cliente/cliente-lista";
    }
}
