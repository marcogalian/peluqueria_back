package com.marcog.peluqueria.clientes.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private UUID id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String notas;
    private String genero;
}
