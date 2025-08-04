package com.proyectoinventario.ProyectoInventario.model;

public class PedidoProducto {

    //atributos

    private Pedido idPedido;
    private Producto idProducto;

    //metodos


    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }
}
