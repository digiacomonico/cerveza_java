import model.*;

public class Test {

    public static void main(String [] args){
        Lupulo lupA = new Lupulo("Importado");
        Levadura levA = new Levadura("Alta",lupA);
        Clasica clasA = new Clasica(levA,lupA);

        System.out.println(clasA.getCosto()+ "\n");


        Lupulo lupB = new Lupulo("Importado");
        Levadura levB = new Levadura("Alta",lupB);
        Lager lagA = new Lager(levB,lupB);
        lagA.agregarIngredientes("A");

        System.out.println(lagA.getCosto()+ "\n");

        Lupulo lupC = new Lupulo("Importado");
        Levadura levC = new Levadura("Alta", lupC);
        Porter portA = new Porter(2000,lupC,levC);

        System.out.println(portA.getCosto() + "\n");



    }

}