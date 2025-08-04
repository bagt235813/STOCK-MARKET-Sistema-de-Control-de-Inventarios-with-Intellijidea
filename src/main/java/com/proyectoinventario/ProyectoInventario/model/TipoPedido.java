package com.proyectoinventario.ProyectoInventario.model;

public class TipoPedido {

    //Atributos
    private Long idTipoPedido;
    private PedidoEntrada idPedidoEntrada;
    private PedidoSalida idPedidoSalida;

    //metodos getter and setter

    public Long getIdTipoPedido() {
        return idTipoPedido;
    }

    public void setIdTipoPedido(Long idTipoPedido) {
        this.idTipoPedido = idTipoPedido;
    }

    public PedidoEntrada getIdPedidoEntrada() {
        return idPedidoEntrada;
    }

    public void setIdPedidoEntrada(PedidoEntrada idPedidoEntrada) {
        this.idPedidoEntrada = idPedidoEntrada;
    }

    public PedidoSalida getIdPedidoSalida() {
        return idPedidoSalida;
    }

    public void setIdPedidoSalida(PedidoSalida idPedidoSalida) {
        this.idPedidoSalida = idPedidoSalida;
    }
}
