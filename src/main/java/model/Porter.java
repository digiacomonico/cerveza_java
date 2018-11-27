package model;

public class Porter extends Clasica{

    protected int costoLogistica;
    protected int kms;

    @Override
    public double costo() {
        return (this.valorLupulo + this.valorLevadura) * (1 + this.costoLogistica);
    }

    public void cantidadKms(int kilometros){
        this.kms = kilometros;
        this.costoLogistica = (2 * kilometros)/100;
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
