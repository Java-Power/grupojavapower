package com.ciclo3.proyectoc3.services;

import com.ciclo3.proyectoc3.entities.MovimientoDinero;
import com.ciclo3.proyectoc3.repositories.MovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicioMovimientoDinero {
    @Autowired
    private MovimientoDineroRepository movimientoDineroRepository;

    // METODO QUE ME MUESTRA TODOS LOS MOVIMIENTOS SIN FILTRO
    public List<MovimientoDinero>getAllMovimientosDinero(){
        List<MovimientoDinero> movimientosDineroList = new ArrayList<>();
        MovimientoDineroRepository.findAll().forEach(movimientoDinero -> movimientosDineroList.add(movimientoDinero));
        return movimientosDineroList;
    }
    //VER MOVIMIENTOS POR ID
    public MovimientoDinero getMovimientoDineroById(Integer id){
        return movimientoDineroRepository.findAllById(id).get();
    }

    //GUARDAR O ACTUALIZAR MOVIMIENTO
    public MovimientoDinero saveOrUpdateMovimientoDinero(MovimientoDinero movimientoDinero){
        MovimientoDinero mov=movimientoDineroRepository.save(movimientoDinero);
        return mov;
    }

    public ServicioMovimientoDinero(MovimientoDineroRepository movimientoDineroRepository) {
        this.movimientoDineroRepository = movimientoDineroRepository;
    }
}
