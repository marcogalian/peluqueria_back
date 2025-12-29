package com.marcog.peluqueria.infrastructure.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.UUID;

@Entity
@Table(name = "clientes")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JdbcTypeCode(SqlTypes.UUID)
    @Column(columnDefinition = "UUID", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellidos", length = 100, nullable = false)
    private String apellidos;

    @Column(name = "telefono", length = 20, nullable = false, unique = true)
    private String telefono;

    @Column(name = "email", length = 150, unique = true)
    private String email;

    @Column(name = "notas", columnDefinition = "TEXT")
    private String notas;
}
