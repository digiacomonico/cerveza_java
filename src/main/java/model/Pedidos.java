package model;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {

    protected List<Lotes> lotes = new ArrayList<Lotes>();
    //protected int valorDescuento;
    protected int distancia;

    public void agregarLote(Lotes lote){
        lotes.add(lote);
    }

    public int cantidadLotes(){
        return lotes.size();
    }

    public void setDistancia(int kms){
        this.distancia = kms;
    }

    public int getDistancia(){
        return this.distancia;
    }





//    var lotes = []
//    var valorDescuento = 0
//    var distancia
//
//    method agregarLote(lote){
//        lotes.add(lote)
//    }
//
//    method quitarLote(lote){
//        lotes.remove(lote)
//    }
//
//    method cantidadLotes(){
//        return lotes.size()
//    }
//
//    method costo(){
//        return (lotes.sum({l => l.costo()})) * (1 -valorDescuento)
//    }
//
//    method distancia(){
//        return distancia
//    }
//
//    method distancia(kms){
//        distancia = kms
//    }
}
