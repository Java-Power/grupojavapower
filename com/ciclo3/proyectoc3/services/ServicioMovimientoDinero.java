package com.ciclo3.proyectoc3.services;

import com.ciclo3.proyectoc3.repositories.MovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMovimientoDinero {
    @Autowired
    private MovimientoDineroRepository movimientoDineroRepository;

    public ServicioMovimientoDinero(MovimientoDineroRepository movimientoDineroRepository) {
        this.movimientoDineroRepository = movimientoDineroRepository;
    }
}
