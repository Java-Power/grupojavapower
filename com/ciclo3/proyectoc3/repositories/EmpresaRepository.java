package com.ciclo3.proyectoc3.repositories;

import com.ciclo3.proyectoc3.entities.Empleado;
import com.ciclo3.proyectoc3.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa,Long>{
}
