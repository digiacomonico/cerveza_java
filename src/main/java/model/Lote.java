package model;

import java.util.ArrayList;
import java.util.List;

public class Lote {

    private List<Cerveza> cervezas = new ArrayList<Cerveza>();
    private int costo;
    private String tipo;


    public  List<Cerveza> getCervezas(){
        return this.cervezas;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void agregarCerveza(Cerveza cerveza){
        cervezas.add(cerveza);
    }

    public int cantidadCervezas(){
        return cervezas.size();
    }

    public int getCosto(){
        return this.costo;
    }

    public void setCosto(int costo){
        this.costo = costo;
    }



//    var lote = []
//    var costoLote
//    var tipoLote
//
//    method lote(){
//        return lote
//    }
//
//    method tipoLote(tipo){
//        tipoLote = tipo
//    }
//
//    method tipoLote(){
//        return tipoLote
//    }
//
//    method agregarCerveza(cerveza){
//        lote.add(cerveza)
//    }
//
//    method quitarCerveza(cerveza){
//        lote.remove(cerveza)
//    }
//
//    method cantidadCervezas(){
//        return lote.size()
//    }
//
//    method costo(){
//        return costoLote
//    }
//
//    method costo(costo){
//        costoLote = costo
//    }


}
