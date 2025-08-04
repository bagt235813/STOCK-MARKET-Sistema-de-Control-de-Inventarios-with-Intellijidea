package com.proyectoinventario.ProyectoInventario.model;

import java.util.Date;

public class Pedido {

    //atributos
    private Long idPedido;
    private Date fechaPedido;
    private int cantidad;
    private Proveedor idProveedor;
    private TipoPedido idTipoPedido;

    //metodos getter and setter

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Proveedor getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Proveedor idProveedor) {
        this.idProveedor = idProveedor;
    }

    public TipoPedido getIdTipoPedido() {
        return idTipoPedido;
    }

    public void setIdTipoPedido(TipoPedido idTipoPedido) {
        this.idTipoPedido = idTipoPedido;
    }
}
