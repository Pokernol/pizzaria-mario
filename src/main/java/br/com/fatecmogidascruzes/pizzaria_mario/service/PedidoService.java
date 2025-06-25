package br.com.fatecmogidascruzes.pizzaria_mario.service;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Pedido;

import java.util.List;

public interface PedidoService {
    List<Pedido> listarTodos();
    Pedido buscarPorId(String id);
    Pedido salvar(Pedido pedido);
    void deletar(String id);
}
