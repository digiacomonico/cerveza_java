package model;

public class Clasica{

//    private double valorLevadura;
    private Levadura levadura;
    private Lupulo lupulo;

    public Clasica(Levadura levadura, Lupulo lupulo) {
        this.levadura = levadura;
        this.lupulo = lupulo;
    }

    public double getCosto() {
        return lupulo.getValorLupulo() + levadura.getValorLevadura();
    }


//    public double getValorLevadura(){
//        return levadura.getValorLevadura();
//    }

}



//    method valorDescuento(){
//        return 0
//    }

