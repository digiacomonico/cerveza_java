package model;

public class Cerveza {


    protected int valorLupulo;
    protected double constLupulo;
    protected String tipoLupulo;

    public Cerveza() {
        System.out.println("Cerveza (Padre) instanciada");
    }


    public String getTipoLupulo(){
        return this.tipoLupulo;
    }

    public void setTipoLupulo(String tipoLupulo){
        this.tipoLupulo = tipoLupulo;
    }




    public int getValorLupulo(){
        return this.valorLupulo;
    }


    public void setValorLupulo(){
        if(this.getTipoLupulo() =="Importado"){
            this.valorLupulo = 1000;
        }
        else if(this.getTipoLupulo() == "Local"){
            this.valorLupulo = 800;
        }

    }


    public double getConstLupulo(){
        return this.constLupulo;
    }

    public void setConstLupulo(){
        if(this.getTipoLupulo() =="Importado"){
            this.constLupulo = 2.4;
        }
        else if(this.getTipoLupulo() == "Local"){
            this.constLupulo = 1.6;
        }
    }

    @Override
    public String toString() {
        return "Cerveza{" +
                "valorLupulo=" + valorLupulo +
                ", constLupulo=" + constLupulo +
                ", tipoLupulo='" + tipoLupulo + '\'' +
                '}';
    }
}


//    method constLupulo(origen){
//        if(origen == "Importado"){
//            constLupulo = 2.4
//        }
//        else if (origen == "Local"){
//            constLupulo = 1.6
//        }
//    }
//    method constLupulo(){
//        return constLupulo
//    }
//
//    method calcularIBUS(azucar){
//        return azucar * (self.constLupulo() / 2)
//    }
//}
//
//}
