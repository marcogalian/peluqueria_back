package com.marcog.peluqueria.domain.port;

import com.marcog.peluqueria.domain.model.Cliente;

import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository {
    Cliente save(Cliente cliente);
    Optional<Cliente> findById(UUID id);
}
