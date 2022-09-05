package com.ciclo3.proyectoc3.repositories;

import com.ciclo3.proyectoc3.entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero, Long> {
}
