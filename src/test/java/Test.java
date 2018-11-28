import model.*;

public class Test {

    public static void main(String [] args){
        Lupulo lupA = new Lupulo("Importado");
        Levadura levA = new Levadura("Alta",lupA);
        Clasica clasA = new Clasica(levA,lupA);

        System.out.println(clasA.getCosto());

    }

}