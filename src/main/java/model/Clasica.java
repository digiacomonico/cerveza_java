package model;

public class Clasica extends Cerveza {

    private double valorLevadura;

    public double getCosto() {
        return this.getValorLupulo() + this.valorLevadura;
    }

    public double getValorLevadura(){
        return this.valorLevadura;
    }


    public void tipoLevadura(String tipo) {
        if (tipo == "Alta") {
            this.valorLevadura = 0.1 * this.getValorLupulo();
        } else if (tipo == "Baja") {
            this.valorLevadura = 0;
        }
    }

}



//    method valorDescuento(){
//        return 0
//    }

