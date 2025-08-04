package com.proyectoinventario.ProyectoInventario.model;

import java.util.Date;

public class Inventario {

    //atributos

    private Long idInventario;
    private Date fechaInvetario;
    private Producto idProducto; // referencia a clase producto

    //metodos getter and setter


    public Long getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Long idInventario) {
        this.idInventario = idInventario;
    }

    public Date getFechaInvetario() {
        return fechaInvetario;
    }

    public void setFechaInvetario(Date fechaInvetario) {
        this.fechaInvetario = fechaInvetario;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }
}
