package br.com.fatecmogidascruzes.pizzaria_mario.facade;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Cliente;
import br.com.fatecmogidascruzes.pizzaria_mario.service.ClienteService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteFacade {

    private final ClienteService clienteService;

    public ClienteFacade(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public Cliente salvarCliente(Cliente cliente) {
        return clienteService.salvar(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteService.listarTodos();
    }

    public Cliente buscarClientePorId(String id) {
        return clienteService.buscarPorId(id);
    }

    public void deletarCliente(String id) {
        clienteService.deletar(id);
    }
}
