package model;

public class Porter extends Clasica {

    private int costoLogistica;
    private int kms;


    public Porter(int kms, Lupulo lupulo, Levadura levadura) {
        super(levadura, lupulo);
        this.kms = kms;
        this.costoLogistica = (2 * this.kms) / 100;
    }

    public double getCosto() {
        return super.getCosto() * (1 + this.costoLogistica);
    }

    public int getCostoLogistica(){
        return this.costoLogistica;
    }

    public int getKms(){
        return this.kms;
    }


    //    var costoLogistica
//    var kms
//    var valorDescuento
//
//    override method costo(){
//        return ((self.valorLupulo() + valorLevadura) * (1 +self.costoLogistica())) //* (1 - valorDescuento)
//    }
//
//    method cantidadKms(kilometros){
//        kms = kilometros
//        costoLogistica = (2 * kilometros)/100
//    }
//
//    method costoLogistica(){
//        return costoLogistica
//    }
//
//    method kms(){
//        return kms
//    }


}
