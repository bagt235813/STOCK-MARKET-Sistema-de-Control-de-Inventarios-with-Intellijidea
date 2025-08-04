package com.proyectoinventario.ProyectoInventario.model;

public class PedidoEntrada {

    //atributo

    private Long idPedidoEntrada;
    private float valorCompra;
    private Proveedor idProvedor;

    //metodos getter and setter


    public Long getIdPedidoEntrada() {
        return idPedidoEntrada;
    }

    public void setIdPedidoEntrada(Long idPedidoEntrada) {
        this.idPedidoEntrada = idPedidoEntrada;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Proveedor getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(Proveedor idProvedor) {
        this.idProvedor = idProvedor;
    }
}
