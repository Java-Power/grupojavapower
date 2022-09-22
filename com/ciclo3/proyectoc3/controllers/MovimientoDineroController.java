package com.ciclo3.proyectoc3.controllers;

import com.ciclo3.proyectoc3.entities.MovimientoDinero;
import com.ciclo3.proyectoc3.services.ServicioMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprises/[id]/movements")
public class MovimientoDineroController {

    @Autowired
    ServicioMovimientoDinero servicioMovimientoDinero;


    @GetMapping("/movimientos") // Consultar todos los movimientos
    public List<MovimientoDinero> VerMovimientos(){
        return servicioMovimientoDinero.g;
    }

    @PostMapping("/movimientos")
    public MovimientoDinero guardarMovimiento(@RequestBody MovimientoDinero movimientoDinero){
        return servicioMovimientoDinero.saveOrUpdateMovimientoDinero(movimientoDinero);
    }



}
