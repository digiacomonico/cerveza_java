package model;

import java.util.ArrayList;
import java.util.List;

public class Lager extends Clasica {

    private List<String> ingredientes = new ArrayList<String>();

    public Lager(Levadura levadura, Lupulo lupulo) {
        super(levadura, lupulo);
        this.levadura = levadura;
        this.lupulo = lupulo;
    }


    public double getCosto() {
        // TODO -> Agregar descuento
        return super.getCosto()+ (this.getCantidadIngredientes() * 50) ;
    }


    public void agregarIngredientes(String ingrediente){
        ingredientes.add(ingrediente);
    }

    public int getCantidadIngredientes(){
        return ingredientes.size();
    }


    public Integer descuento(){
        return 0;

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
