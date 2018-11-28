package model;

import java.util.ArrayList;
import java.util.List;


public class Distribuidora {


    private Pedido pedido;
    private Integer descuentoAPartir;

    public Distribuidora(Integer descuentoAPartir, Pedido pedido) {
        this.pedido = pedido;
        this.descuentoAPartir = descuentoAPartir;
    }

    public double getCosto(Pedido pedido) {
        return pedido.getCosto();
    }


    public Integer getCantidadPedidos() {
        return pedido.getCantidad();
    }

    public Integer getDescuentoAPartir() {
        return this.descuentoAPartir;
    }

    public void setDescuentoAPartir(int cantidad) {
        this.descuentoAPartir = cantidad;
    }

    public void descuento() {
        if(pedido.getCantidad() >= this.descuentoAPartir) {
            pedido.descuento();
        }
    }

}














//
//    var pedidos = #{}
//    var descuentoAPartir
//    var totalFacturado
//
//    method totalFacturado(){
//        return totalFacturado
//    }
//
//    method totalFacturado(todosPedidos){
//        pedidos.sum({p => p.costo()})
//    }
//
//    method costo(pedido){
//        return pedido.costo()
//    }
//
//    method agregarPedido(pedido){
//        pedidos.add(pedido)
//    }
//
//    method quitarPedido(pedido){
//        pedidos.remove(pedido)
//    }
//
//    method cantidadPedidos(){
//        return pedidos.size()
//    }
//
//    method descuentoAPartir(cantidad){
//        descuentoAPartir = cantidad
//    }
//
//    method descuentoAPartir(){
//        return descuentoAPartir
//    }
//
//    method darDescuento(pedido){
//        if(pedido.cantidadLotes() >= self.descuentoAPartir()){
//            pedido.descuento()
//        }
//    }

