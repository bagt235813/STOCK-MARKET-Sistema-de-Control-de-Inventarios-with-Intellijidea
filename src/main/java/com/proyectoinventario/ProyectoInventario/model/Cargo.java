package com.proyectoinventario.ProyectoInventario.model;

public class Cargo {

    //atributos

    private Long idCargo;
    private String cargo;

    //metodos getter and setter

    public Long getIdCargo(){
        return idCargo;
    }

    public void setIdCargo(Long idCargo) {
        this.idCargo = idCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
