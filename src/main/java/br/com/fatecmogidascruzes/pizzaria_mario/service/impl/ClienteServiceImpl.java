package br.com.fatecmogidascruzes.pizzaria_mario.service.impl;

import br.com.fatecmogidascruzes.pizzaria_mario.exception.ClienteNotFoundException;
import br.com.fatecmogidascruzes.pizzaria_mario.model.Cliente;
import br.com.fatecmogidascruzes.pizzaria_mario.repository.ClienteRepository;
import br.com.fatecmogidascruzes.pizzaria_mario.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new ClienteNotFoundException(id));
    }

    @Override
    public void deletar(Long id) {
        if (!clienteRepository.existsById(id)) {
            throw new ClienteNotFoundException(id);
        }
        clienteRepository.deleteById(id);
    }
}
