import model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CervezasTest {

    Lupulo lupA;
    Lupulo lupB;
    Levadura levA;
    Levadura levB;
    Levadura levC;
    Levadura levD;
    Distribuidora distrA;
    Pedido pedA;

    @Before
    public void init(){

        lupA = new Lupulo("Importado");
        lupB = new Lupulo("Local");
        
        levA = new Levadura("Alta",lupA);
        levB = new Levadura("Alta",lupB);
        levC = new Levadura("Baja",lupA);
        levD = new Levadura("Baja",lupB);


        Lager lagA = new Lager(levB,lupB);
        lagA.agregarIngredientes("A");

        System.out.println(lagA.getCosto()+ "\n");


        distrA = new Distribuidora(10,pedA);

    }

    @Test
    public void costoClasica(){
        Clasica clasica = new Clasica(levA,lupA);
        Assert.assertEquals(1100.0,clasica.getCosto(),0);
    }


//    @Test
//    public void algodelPedido() {
//        Pedido pedido = new Pedido(new Clasica(levA,lupA),2,distrA);
////        Pedido pedido = new Pedido(new Clasica(levA, lupA));
//        Assert.assertEquals(1, 2);
//    }
}