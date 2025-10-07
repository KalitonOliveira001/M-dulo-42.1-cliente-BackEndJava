package com.kadados.clientes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kadados.clientes.model.Cliente;
import com.kadados.clientes.repository.ClienteRepository;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> listar() {
        return repository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Cliente atualizar(Long id, Cliente novo) {
        Cliente existente = buscarPorId(id);
        if (existente != null) {
            existente.setNome(novo.getNome());
            existente.setEmail(novo.getEmail());
            existente.setTelefone(novo.getTelefone());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
