package br.com.fatecmogidascruzes.pizzaria_mario.controller;

import br.com.fatecmogidascruzes.pizzaria_mario.facade.PedidoFacade;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Pedido;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoRestController {

    private final PedidoFacade pedidoFacade;

    public PedidoRestController(PedidoFacade pedidoFacade) {
        this.pedidoFacade = pedidoFacade;
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedidos() {
        List<Pedido> pedidos = pedidoFacade.listarPedidos();
        return new ResponseEntity<>(pedidos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPedidoPorId(@PathVariable String id) {
        Pedido pedido = pedidoFacade.buscarPedidoPorId(id);
        return new ResponseEntity<>(pedido, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pedido> criarPedido(@RequestBody Pedido pedido) {
        Pedido novoPedido = pedidoFacade.salvarPedido(pedido);
        return new ResponseEntity<>(novoPedido, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> atualizarPedido(@PathVariable String id, @RequestBody Pedido pedido) {
        pedido.setId(id);
        Pedido pedidoAtualizado = pedidoFacade.salvarPedido(pedido);
        return new ResponseEntity<>(pedidoAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPedido(@PathVariable String id) {
        pedidoFacade.deletarPedido(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
