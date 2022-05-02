package com.github.arthuramaraim.clientes.model.repository;

import com.github.arthuramaraim.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Cliente, Integer> {


}
