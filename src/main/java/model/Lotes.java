package model;

import java.util.ArrayList;
import java.util.List;

public class Lotes {

    protected List<Cerveza> lote = new ArrayList<Cerveza>();
    protected int costoLote;
    protected String tipoLote;



    public void setTipoLote(String tipo){
        this.tipoLote = tipo;
    }

    public String getTipoLote(){
        return this.tipoLote;
    }

    public void agregarCerveza(Cerveza cerveza){
        lote.add(cerveza);
    }

    public int cantidadCervezas(){
        return lote.size();
    }

    public int costo(){
        return this.costoLote;
    }

    public void costo(int costo){
        this.costoLote = costo;
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
