package model;

public class Lupulo {

    private int valorLupulo;
    private double constLupulo;
    private String tipoLupulo;

    public Lupulo(String tipoLupulo) {
        this.tipoLupulo = tipoLupulo;
        this.setValorLupulo();
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


    public double calcularIBUS(int azucar){
        return azucar * (this.constLupulo / 2);
    }

    @Override
    public String toString() {
        return "Lupulo{" +
                "valorLupulo=" + valorLupulo +
                ", constLupulo=" + constLupulo +
                ", tipoLupulo='" + tipoLupulo + '\'' +
                '}';
    }
}
