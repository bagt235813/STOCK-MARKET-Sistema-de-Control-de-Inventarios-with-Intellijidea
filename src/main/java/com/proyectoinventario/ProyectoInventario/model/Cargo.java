package com.proyectoinventario.ProyectoInventario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity
public class Cargo {

    //atributos
    //@Id
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
