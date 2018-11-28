package model;

public class Levadura {

    private double valorLevadura;
    private String tipoLevadura;
    public Lupulo lupulo;

    public Levadura(String tipoLevadura, Lupulo lupulo) {
        this.tipoLevadura = tipoLevadura;
        this.lupulo = lupulo;
        this.setValorLevadura();
    }

    public double getValorLevadura() {
        return this.valorLevadura;
    }

//    public void setValorLevadura(double valorLevadura) {
//        this.valorLevadura = valorLevadura;
//    }

    public String getTipoLevadura(){
        return this.tipoLevadura;
    }


    private void setValorLevadura(){
        if(this.getTipoLevadura() == "Alta"){
            valorLevadura = 0.1 * lupulo.getValorLupulo();
        }
        else if(this.getTipoLevadura() == "Baja"){
            valorLevadura = 0;
        }
    }




//    method tipoLevadura(tipo){
//        if(tipo == "Alta"){
//            valorLevadura = 0.1 * self.valorLupulo()
//        }
//        else if (tipo == "Baja"){
//            valorLevadura = 0
//        }
//    }


    @Override
    public String toString() {
        return "Levadura{" +
                "valorLevadura=" + valorLevadura +
                '}';
    }
}
