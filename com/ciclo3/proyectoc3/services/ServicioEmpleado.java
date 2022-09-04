package com.ciclo3.proyectoc3.services;

import com.ciclo3.proyectoc3.entities.Empleado;
import com.ciclo3.proyectoc3.repositories.EmpleadoRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ServicioEmpleado {

    private EmpleadoRepository userRepository;

    public ServicioEmpleado(EmpleadoRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Empleado> getUsers() {
        return this.userRepository.findAll();
    }

    public Empleado getUser(long id){
        Optional<Empleado> user = this.userRepository.findById(id);
        return user.orElse(null);
    }

    public Empleado createUser( Empleado user){
        return this.userRepository.save(user);
    }

    public Empleado updateUser(long id, Empleado user){
        Optional<Empleado> dbData = this.userRepository.findById(id);

        if(dbData.isPresent()){
            Empleado e = dbData.get();
            e.setNombre(user.getNombre());
            e.setCorreo(user.getCorreo());

            this.userRepository.save(e);
            return e;
        }
        return null;
    }

    public Boolean deleteUser(long id){
        try{
            this.userRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
