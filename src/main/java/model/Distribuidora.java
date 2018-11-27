package model;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {


    private List<Pedidos> pedidos = new ArrayList<Pedidos>();
    private int descuentoAPartir;

    public int getCosto(Pedidos pedido){
        return pedido.getCosto();
    }

    public void agregarPedidos(Pedidos pedido){
        pedidos.add(pedido);
    }

    public int cantidadPedidos(){
        return pedidos.size();
    }

    public int getDescuentoAPartir(){
        return this.descuentoAPartir;
    }

    public void setDescuentoAPartir(int cantidad){
        this.descuentoAPartir = cantidad;
    }

    public void darDescuento(Pedidos pedido){
        if(pedido.cantidadLotes() >= this.descuentoAPartir){
            pedido.descuento();
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
}
