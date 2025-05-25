package br.com.fatecmogidascruzes.pizzaria_mario.service;

import br.com.fatecmogidascruzes.pizzaria_mario.model.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> listarTodos();
    Cliente buscarPorId(Long id);
    Cliente salvar(Cliente cliente);
    void deletar(Long id);
}
