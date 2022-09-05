package com.ciclo3.proyectoc3.entities;

import javax.persistence.*;

@Entity
@Table(name = "movimientoDinero")
public class MovimientoDinero {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movimientoDinero_id")
    private long id;
    @Column(name = "monto")
    private Float monto;
    @Column(name = "concepto")
    private String concepto;
    @Column(name = "usuario")
    private String usuario;

    // Relacion de uno a muchos, una transaccion solo puede tener un empleado o una empresa

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Empresa.class)
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Empleado.class)
    @JoinColumn(name = "empelado_id")
    private Empleado empleado;
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
