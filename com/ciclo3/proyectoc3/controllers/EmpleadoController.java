package com.ciclo3.proyectoc3.controllers;

import com.ciclo3.proyectoc3.entities.Empleado;
import com.ciclo3.proyectoc3.services.ServicioEmpleado;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    ServicioEmpleado service;

    public EmpleadoController(ServicioEmpleado services) {
        this.service = services;
    }

    @GetMapping("/user")
    public List<Empleado> getUsers() {
        return this.service.getUsers();
    }

    @GetMapping("/user/{id}")
    public Empleado getUser(@PathVariable("id") long id){
        return this.service.getUser(id);

    }

    @PostMapping("/user")
    public Empleado createUser(@RequestBody Empleado user){
        return  this.service.createUser(user);

    }

    @PutMapping("/user/{id}")
    public Empleado updateUser(@PathVariable("id") long id, @RequestBody Empleado user){
        return this.service.updateUser(id,user);
    }

    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable("id") long id){
        return this.service.deleteUser(id);

    }
}
