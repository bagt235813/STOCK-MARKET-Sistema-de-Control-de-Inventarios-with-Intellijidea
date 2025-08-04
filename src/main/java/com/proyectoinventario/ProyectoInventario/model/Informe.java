package com.proyectoinventario.ProyectoInventario.model;

public class Informe {

    //atributos

    private Long idInforme;
    private Empleado idEmpleado;
    private Inventario idInventario;

    //metodos


    public Long getIdInforme() {
        return idInforme;
    }

    public void setIdInforme(Long idInforme) {
        this.idInforme = idInforme;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Inventario getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Inventario idInventario) {
        this.idInventario = idInventario;
    }
}
