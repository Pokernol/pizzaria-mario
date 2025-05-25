package br.com.fatecmogidascruzes.pizzaria_mario.controller;

import br.com.fatecmogidascruzes.pizzaria_mario.dto.PedidoDTO;
import br.com.fatecmogidascruzes.pizzaria_mario.facade.PedidoFacade;
import br.com.fatecmogidascruzes.pizzaria_mario.mapper.PedidoMapper;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Pedido;
import br.com.fatecmogidascruzes.pizzaria_mario.model.StatusPedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoFacade pedidoFacade;
    private final PedidoMapper pedidoMapper;

    public PedidoController(PedidoFacade pedidoFacade, PedidoMapper pedidoMapper) {
        this.pedidoFacade = pedidoFacade;
        this.pedidoMapper = pedidoMapper;
    }

    @PostMapping("/salvar")
    public String salvarPedido(@ModelAttribute PedidoDTO pedidoDTO) {
        Pedido pedido = pedidoMapper.toEntity(pedidoDTO);
        pedido.setStatus(StatusPedido.PENDENTE);
        pedidoFacade.salvarPedido(pedido);
        return "redirect:/pedidos/lista";
    }

    @GetMapping("/lista")
    public String listarPedidos(Model model) {
        List<Pedido> pedidos = pedidoFacade.listarPedidos();
        List<PedidoDTO> pedidoDTOs = pedidos.stream()
                .map(pedidoMapper::toDTO)
                .collect(Collectors.toList());
        model.addAttribute("pedidos", pedidoDTOs);
        return "pedido/pedido-lista";
    }

    @GetMapping("/novo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("pedido", new PedidoDTO());
        return "pedido/pedido-form";
    }
}
