package com.ciclo3.proyectoc3.Modelo;

public class MovimientoDinero {
    //ATRIBUTOS
    private Float monto;
    private String concepto;
    private String usuario;

    //CONSTRUCTOR


    public MovimientoDinero(Float monto, String concepto, String usuario) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = usuario;
    }
    //GETTERS AND SETTERS

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
