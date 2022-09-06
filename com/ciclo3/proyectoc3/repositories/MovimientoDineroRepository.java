package com.ciclo3.proyectoc3.repositories;

import com.ciclo3.proyectoc3.entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface MovimientoDineroRepository extends JpaRepository<MovimientoDinero, Long> {
    @Query(value = "select * from movimientoDinero where empresa_id=?1", nativeQuery = true)
    public abstract List<MovimientoDinero> FiltrarMovEmpresa(long id);

}
