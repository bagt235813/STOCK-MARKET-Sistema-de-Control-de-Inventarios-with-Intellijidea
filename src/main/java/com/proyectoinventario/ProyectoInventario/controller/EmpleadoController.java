package com.proyectoinventario.ProyectoInventario.controller;


import com.proyectoinventario.ProyectoInventario.model.Empleado;
import com.proyectoinventario.ProyectoInventario.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    // metodos contrololados e inyeccion automatica de la dependencias

    @Autowired // inyeccion de datos y creaion de un objeto sin crear un constructor
    private EmpleadoRepository empleadoRepository;

    // mostrar empleados
    @GetMapping
    public String ListarEmpleados(Model model) {

        //mostrar todos los empleados de la BD
        List<Empleado> empleados= empleadoRepository.findAll();

        //aggregar elementos a la lista
        model.addAttribute("empleado", empleados); // (donde los muestra, de donde obtiene los datos
        return "empleado";


    }

}
