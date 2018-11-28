package model;

public class Porter {

    private int costoLogistica;
    private int kms;
    private Lupulo lupulo;
    private Levadura levadura;

    public Porter(int kms, Lupulo lupulo, Levadura levadura) {
        this.kms = kms;
        this.lupulo = lupulo;
        this.levadura = levadura;
    }

    public double getCosto() {
        return (lupulo.getValorLupulo() + levadura.getValorLevadura()) * (1 + this.costoLogistica);
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
