package model;

public class Clasica{

//    private double valorLevadura;
    protected Levadura levadura;
    protected Lupulo lupulo;

    public Clasica(Levadura levadura, Lupulo lupulo) {
        this.levadura = levadura;
        this.lupulo = lupulo;
    }


    public double getCosto() {
        return lupulo.getValorLupulo() + levadura.getValorLevadura();
    }

    public Integer descuento(){
        return 0;
    }

}



//    method valorDescuento(){
//        return 0
//    }

