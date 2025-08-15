package com.proyectoinventario.ProyectoInventario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity
public class Categoria {

    //atributos puede ser un enum
    //Id
    private Long idCategoria;
    private String nombreCategoria;

    //metodos getter and setter


    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
}
