package com.marcog.peluqueria.clientes.adapter.out.persistence;

import com.marcog.peluqueria.clientes.domain.model.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {
    public Cliente toDomain(ClienteEntity entity){
        if (entity == null) return null;

        return Cliente.builder()
                .id(entity.getId())
                .nombre(entity.getNombre())
                .apellidos(entity.getApellidos())
                .telefono(entity.getTelefono())
                .email(entity.getEmail())
                .notas(entity.getNotas())
                .build();
    }

    public ClienteEntity toEntity(Cliente domain){
        if (domain == null) return null;

        return ClienteEntity.builder()
                .id(domain.getId())
                .nombre(domain.getNombre())
                .apellidos(domain.getApellidos())
                .telefono(domain.getTelefono())
                .email(domain.getEmail())
                .notas(domain.getNotas())
                .build();

    }
}
