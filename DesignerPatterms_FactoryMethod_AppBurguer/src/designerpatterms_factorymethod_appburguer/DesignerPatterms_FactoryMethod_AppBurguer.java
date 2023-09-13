package designerpatterms_factorymethod_appburguer;

/**
 *
 * @author Henrique_Silva
 */
public class DesignerPatterms_FactoryMethod_AppBurguer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Hamburger angus = new AngusHamburger();
      Hamburger vegano = new VeganoHamburger();
      
      angus.preparar();
      angus.servir();
        System.out.println("|---------------------------|");
      
      vegano.preparar();
      vegano.servir();
    }
    
}
