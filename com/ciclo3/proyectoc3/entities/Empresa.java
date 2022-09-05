package com.ciclo3.proyectoc3.entities;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "empresa")
public class Empresa {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empresa_id")
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "NIT")
    private String NIT;


// Relacion de unna empresa puede tener mucho empelados
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<Empleado> empleados;

 // Relacion de una empresa puede tener muchas transacciones o movimientos de dinero
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<MovimientoDinero> movimientoDineros;


    //CONTRUCTOR

   public Empresa(String nombre, String direccion, String telefono, String NIT) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
    }

    //GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
}
