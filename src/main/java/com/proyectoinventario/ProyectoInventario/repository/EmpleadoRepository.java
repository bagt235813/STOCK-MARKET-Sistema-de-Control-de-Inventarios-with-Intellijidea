package com.proyectoinventario.ProyectoInventario.repository;

    //metodos de libreria de comunicacion de la base datos de interface

import com.proyectoinventario.ProyectoInventario.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//anotacion

@Repository
public interface EmpleadoRepository extends JpaRepository <Empleado,Long> {

    // conexion del modelo con el controlador
    //al extender el JPARepository esta interfaz hereda los metodos
}
