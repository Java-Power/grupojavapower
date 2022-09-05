package com.ciclo3.proyectoc3.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empleado")
public class Empleado {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empleado_id")
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "correo")
    private String correo;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "rol")
    private String rol;


    //Relacion de un empelado solo puede tener una empresa
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Empresa.class)
    @JoinColumn(name = "empresa_id")
    private Empresa empresas;

    //Relacion de un empleado puede tener muchos movimientos de dinero
    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL)
    private List<MovimientoDinero> movimientoDineros;

    //CONSTRUCTOR


    public Empleado(String nombre, String correo, String empresa, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    //GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
