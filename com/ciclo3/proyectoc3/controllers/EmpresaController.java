package com.ciclo3.proyectoc3.controllers;

import com.ciclo3.proyectoc3.entities.Empresa;
import com.ciclo3.proyectoc3.services.ServicioEmpresa;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EmpresaController {
    ServicioEmpresa service;

    public EmpresaController(ServicioEmpresa services) {
        this.service = services;
    }

    @GetMapping("/enterprises")
    public List<Empresa> getEnterprises() {
        return this.service.getEnterprises();
    }

    @GetMapping("/enterprises/{id}")
    public Empresa getUser(@PathVariable("id") long id){
        return this.service.getEnterprise(id);

    }

    @PostMapping("/enterprises")
    public Empresa createUser(@RequestBody Empresa enterprise){
        return  this.service.createEnterprise(enterprise);

    }

    @PutMapping("/enterprises/{id}")
    public Empresa updateUser(@PathVariable("id") long id, @RequestBody Empresa enterprise){
        return this.service.updateEnterprise(id,enterprise);
    }

    @DeleteMapping("/enterprises/{id}")
    public Boolean deleteUser(@PathVariable("id") long id){
        return this.service.deleteEnterprise(id);

    }
}
