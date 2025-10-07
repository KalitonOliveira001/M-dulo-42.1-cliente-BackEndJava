package com.kadados.clientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kadados.clientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
