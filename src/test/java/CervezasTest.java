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

    // lupA = LupuloImportado
    // lupB = LupuloLocal
    // Levadura levA -> Alta (con Lupulo Importado)
    // Levadura levB -> Baja
    // Levadura levC -> Alta (con Lupulo Local)
    // Levadura levD -> Baja(con Lupulo Local)


    @Test
    public void costoClasicaConLupuloImportadoYLevaduraAlta(){
        Clasica clasica = new Clasica(levA,lupA);
        Assert.assertEquals(1100.0,clasica.getCosto(),0);
    }

    @Test
    public void costoClasicaConLupuloImportadoYLevaduraBaja(){
        // TODO -> Poner levadura baja y ver cuanto tendria que salir
        Clasica clasica = new Clasica(levA,lupA);
        Assert.assertEquals(1100.0,clasica.getCosto(),0);
    }

    @Test
    public void costoClasicaConLupuloLocalYLevaduraAlta(){
        // TODO -> Poner lupulo local y  levadura alta , ver cuanto tendria que salir
        Clasica clasica = new Clasica(levA,lupA);
        Assert.assertEquals(1100.0,clasica.getCosto(),0);
    }

    @Test
    public void costoClasicaConLupuloLocalYLevaduraBaja(){
        // TODO -> Poner lupulo local y  levadura baja , ver cuanto tendria que salir
        Clasica clasica = new Clasica(levA,lupA);
        Assert.assertEquals(1100.0,clasica.getCosto(),0);
    }

    @Test
    public void costoLagerCon0Ingredientes(){
        Lager lager = new Lager(levA,lupA);
        Assert.assertEquals(1100.0,lager.getCosto(),0);
    }

    @Test
    public void costoLagerCon1Ingrediente(){
        Lager lager = new Lager(levA,lupA);
        lager.agregarIngredientes("A");
        Assert.assertEquals(1150,lager.getCosto(),0);
    }

    @Test
    public void costoLagerCon2Ingredientes(){
        Lager lager = new Lager(levA,lupA);
        lager.agregarIngredientes("A");
        lager.agregarIngredientes("B");
        Assert.assertEquals(1200,lager.getCosto(),0);
    }




//    @Test
//    public void algodelPedido() {
//        Pedido pedido = new Pedido(new Clasica(levA,lupA),2,distrA);
////        Pedido pedido = new Pedido(new Clasica(levA, lupA));
//        Assert.assertEquals(1, 2);
//    }
}