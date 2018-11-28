package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pedido {


    Clasica tipoLote;
    Integer cantidad;
    //private List<Clasica> lotes = new ArrayList<>();
    private Distribuidora distribuidora;


    public Pedido(Clasica tipoLote, Integer cantidad, Distribuidora distribuidora) {
        this.cantidad = cantidad;
        this.tipoLote = tipoLote;
    }

    public double getCosto(){
        return tipoLote.getCosto() * this.cantidad;
    }


    public void descuento(){
        tipoLote.descuento();
    }


    public Integer getCantidad(){
        return this.cantidad;
    }

}

//    public int getCosto(){
//        return lotes
//                .stream()
//                .mapToInt(l -> l.getCosto())
//                .sum();
//    }
//
//    public void descuento(){
//        if distribuidora.cantidadMinima < this.cantLotes
//         List<Lote> loteLager = lotes.stream().filter(l -> l.getTipo().equals("Lager")).collect(Collectors.toList());
//         List<Lote> lotePorter = lotes.stream().filter(l -> l.getTipo().equals("Porter")).collect(Collectors.toList());
//        if(!loteLager.isEmpty()){
//            Lote primerLote = loteLager.get(0);
//            return primerLote.getCervezas().get(0).descuento();
//        }
//    }
//
//    // TODO -> terminarlo
//    public void descuento(){
//
//    if distribuidora.cantidadMinima < this.cantLotes
//
//    clasica.descuento()
//    lager.descuento()
//    porter.descuento()
//
//
//
//    }
//
//
//
//
//    */













    //int cantidadIng = lotes.stream().filter(l -> l.tipoLote == "Lager").

//    method descuento(){
//        if(lotes.filter({l => l.tipoLote() == "Lager"}).size() > 0){
//            var ingredientes = lotes.filter({l => l.tipoLote() == "Lager"}).first().lote().first().cantidadIngredientes()
//            if(ingredientes > 5){
//                valorDescuento = 0.2
//            }
//            else if (ingredientes >= 2){
//                valorDescuento = 0.02 * ingredientes
//            }
//
//        }
// 		else if (lotes.filter({l => l.tipoLote() == "Porter"}).size() > 0){
//            if(self.distancia() < 10){
//                valorDescuento = 0.1
//            }
//        }
//    }



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

