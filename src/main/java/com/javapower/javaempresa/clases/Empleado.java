package com.javapower.javaempresa.clases;

public class Empleado {

//Atributos
    String nombre;
    String correoElectronico;
    String empresaEmpleado;
    String rolEmpleado;


    public Empleado(String nombre, String correoElectronico, String empresaEmpleado, String rolEmpleado) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;


        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }


}