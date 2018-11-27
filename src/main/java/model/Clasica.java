package model;

public class Clasica extends Cerveza {

    protected double valorLevadura;

    public double costo() {
        return this.valorLupulo + this.valorLevadura;
    }


    public void tipoLevadura(String tipo) {
        if (tipo == "Alta") {
            this.valorLevadura = 0.1 * this.valorLupulo;
        } else if (tipo == "Baja") {
            this.valorLevadura = 0;
        }
    }

}



//    method valorDescuento(){
//        return 0
//    }

