package model;

import java.util.ArrayList;
import java.util.List;

public class Lager extends Clasica {

    private List<String> ingredientes = new ArrayList<String>();

    @Override
    public double getCosto() {
        // TODO -> Agregar descuento
        return this.getValorLupulo() + this.getValorLevadura() + (this.getCantidadIngredientes() * 50) ;
    }


    public void agregarIngredientes(String ingrediente){
        ingredientes.add(ingrediente);
    }

    public int getCantidadIngredientes(){
        return ingredientes.size();
    }

    //    var ingredientes = []
//    var valorDescuento
//
//
//    override method costo(){
//        return (self.valorLupulo() + valorLevadura + (self.cantidadIngredientes() * 50)) //* (1 -valorDescuento)
//    }
//
//    override method valorDescuento(){
//        return valorDescuento
//    }
//
//
//
//
//    method agregarIngredientes(ingrediente){
//        ingredientes.add(ingrediente)
//    }
//
//    method quitarIngrediente(ingrediente){
//        ingredientes.remove(ingrediente)
//    }
//
//    method cantidadIngredientes(){
//        if(ingredientes.size() == null){
//            return 0
//        }
//        else return ingredientes.size()
//    }
//
//}

}
