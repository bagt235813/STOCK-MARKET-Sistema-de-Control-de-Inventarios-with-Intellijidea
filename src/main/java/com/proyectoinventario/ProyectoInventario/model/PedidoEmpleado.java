package com.proyectoinventario.ProyectoInventario.model;

public class PedidoEmpleado {

    //atibutos

    private Empleado idEmpleado;
    private Pedido idPedido;

    //metodos

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }
}
