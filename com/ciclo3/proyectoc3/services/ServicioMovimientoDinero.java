package com.ciclo3.proyectoc3.services;

import com.ciclo3.proyectoc3.entities.MovimientoDinero;
import com.ciclo3.proyectoc3.repositories.MovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ServicioMovimientoDinero {
    @Autowired
    private MovimientoDineroRepository movimientoDineroRepository;

    //METODO QUE ME MUESTRA TODOS LOS MOVIMIENTOS SIN FILTRO
    //public List<MovimientoDinero>getAllMovimientosDinero(){
        //List<MovimientoDinero> movimientosDineroList = new ArrayList<>();
        //MovimientoDineroRepository.findAll().forEach(movimientoDinero -> movimientosDineroList.add(movimientoDinero));
        //return movimientosDineroList;
    //}
    //VER MOVIMIENTOS POR ID
    public MovimientoDinero getMovimientoDineroById(Integer id){
        Optional<MovimientoDinero> movimientoDinero=movimientoDineroRepository.findById(id);
        return movimientoDinero.get();
    }

    //GUARDAR O ACTUALIZAR MOVIMIENTO
    public MovimientoDinero saveOrUpdateMovimientoDinero(MovimientoDinero movimientoDinero){
        MovimientoDinero mov=movimientoDineroRepository.save(movimientoDinero);
        return mov;
    }

    public boolean deleteMovimientoDinero(Integer id){ //Elimina movimiento por id
        movimientoDineroRepository.deleteById(id); //Elimina usando el metodo que nos ofrece el repositorio
        if (this.movimientoDineroRepository.findById(id).isPresent()) { // si al buscar el movimiento lo encontramos, no se elimino (false)
            return false;
        }
        return true; //si al buscar el movimiento no lo encontramos, si lo elimino (true)
    }

    //public ServicioMovimientoDinero(MovimientoDineroRepository movimientoDineroRepository) {
        //this.movimientoDineroRepository = movimientoDineroRepository;
    //}

    //obtener movimiento de dinero teniendo en cuenta el id de los empleados
    public ArrayList<MovimientoDinero> obtenerPorEmpleado(Integer id){
       return movimientoDineroRepository.findByEmpleado(id);
    }

    //obtener movimiento de dinero teniendo en cuenta el id de la empresa a la que pertenecen los empleados
    public ArrayList<MovimientoDinero> obtenerPorEpresa(Integer id){
        return movimientoDineroRepository.findByEmpresa(id);
    }


}
