package com.ciclo3.proyectoc3.services;

import com.ciclo3.proyectoc3.entities.Empleado;
import com.ciclo3.proyectoc3.entities.Empresa;
import com.ciclo3.proyectoc3.repositories.EmpleadoRepository;
import com.ciclo3.proyectoc3.repositories.EmpresaRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ServicioEmpresa {

    private EmpresaRepository enterpriseRepository;

    public ServicioEmpresa(EmpresaRepository enterpriseRepository) {
        this.enterpriseRepository = enterpriseRepository;
    }

    public List<Empresa> getEnterprises() {
        return this.enterpriseRepository.findAll();
    }

    public Empresa getEnterprise(long id){
        Optional<Empresa> enterprise = this.enterpriseRepository.findById(id);
        return enterprise.orElse(null);
    }

    public Empresa createEnterprise( Empresa enterprise){
        return this.enterpriseRepository.save(enterprise);
    }

    public Empresa updateEnterprise(long id, Empresa enterprise){
        Optional<Empresa> dbData = this.enterpriseRepository.findById(id);

        if(dbData.isPresent()){
            Empresa e = dbData.get();
            e.setNombre(enterprise.getNombre());
            e.setDireccion(enterprise.getDireccion());
            e.setNIT(enterprise.getNIT());
            e.setTelefono(enterprise.getTelefono());

            this.enterpriseRepository.save(e);
            return e;
        }
        return null;
    }

    public Boolean deleteEnterprise(long id){
        try{
            this.enterpriseRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
