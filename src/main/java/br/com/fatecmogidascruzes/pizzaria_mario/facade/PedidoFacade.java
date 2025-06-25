package br.com.fatecmogidascruzes.pizzaria_mario.facade;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Pedido;
import br.com.fatecmogidascruzes.pizzaria_mario.service.PedidoService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PedidoFacade {

    private final PedidoService pedidoService;

    public PedidoFacade(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public Pedido salvarPedido(Pedido pedido) {
        return pedidoService.salvar(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoService.listarTodos();
    }

    public Pedido buscarPedidoPorId(String id) {
        return pedidoService.buscarPorId(id);
    }

    public void deletarPedido(String id) {
        pedidoService.deletar(id);
    }
}
