package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* public class Pedidos {

    private List<Lote> lotes = new ArrayList<Lote>();
    //private int valorDescuento;
    private int distancia;
    private Distribuidora distribuidora;

    public Pedidos(Distribuidora distribuidora){

    }

    public void agregarLote(Lote lote){
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

    public int getCosto(){
        return lotes
                .stream()
                .mapToInt(l -> l.getCosto())
                .sum();
    }

    public void descuento(){
        if distribuidora.cantidadMinima < this.cantLotes
         List<Lote> loteLager = lotes.stream().filter(l -> l.getTipo().equals("Lager")).collect(Collectors.toList());
         List<Lote> lotePorter = lotes.stream().filter(l -> l.getTipo().equals("Porter")).collect(Collectors.toList());
        if(!loteLager.isEmpty()){
            Lote primerLote = loteLager.get(0);
            return primerLote.getCervezas().get(0).descuento();
        }
    }




    */













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

