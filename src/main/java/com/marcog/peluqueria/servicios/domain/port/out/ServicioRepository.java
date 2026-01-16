package com.marcog.peluqueria.servicios.domain.port.out;

import com.marcog.peluqueria.servicios.domain.model.Servicio;

public interface ServicioRepository {
    Servicio guardar(Servicio servicio);
}
