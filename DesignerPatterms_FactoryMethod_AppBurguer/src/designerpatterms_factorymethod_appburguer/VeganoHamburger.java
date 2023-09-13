package designerpatterms_factorymethod_appburguer;

/**
 *
 * @author Henrique_Silva
 */
public class VeganoHamburger extends Hamburger {
    public VeganoHamburger() {
        super("Vegano Hamburger", "Pão Integral", "Hamburguer de Grão de Bico");
        adicionarIngrediente("Alface");
        adicionarIngrediente("Tomate");
        adicionarIngrediente("Molho Vegano");
    }

    @Override
    public void servir() {
        System.out.println("Servindo o Vegano Hamburger");
    }
}
