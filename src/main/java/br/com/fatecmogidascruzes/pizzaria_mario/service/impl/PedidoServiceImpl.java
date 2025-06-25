package br.com.fatecmogidascruzes.pizzaria_mario.service.impl;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Pedido;
import br.com.fatecmogidascruzes.pizzaria_mario.repository.PedidoRepository;
import br.com.fatecmogidascruzes.pizzaria_mario.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public List<Pedido> listarTodos() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedido buscarPorId(String id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    @Override
    public void deletar(String id) {
        if (pedidoRepository.existsById(id)) {
            pedidoRepository.deleteById(id);
        }
    }
}
