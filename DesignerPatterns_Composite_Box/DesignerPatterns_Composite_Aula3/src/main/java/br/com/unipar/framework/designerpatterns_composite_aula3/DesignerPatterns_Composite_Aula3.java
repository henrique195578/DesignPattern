package br.com.unipar.framework.designerpatterns_composite_aula3;

import br.com.unipar.framework.designerpatterns_composite_aula3.products.Juice;
import br.com.unipar.framework.designerpatterns_composite_aula3.products.Toxies;

/**
 *
 * @author Henrique
 */
public class DesignerPatterns_Composite_Aula3 {

     public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeBox(
                        new Juice("SUCO", 1233.00)
                ),
                 new CompositeBox(
                        new Toxies("TOXICO 1", 25.55),
                        new Toxies("Creatina", 50.00)
                ),
                 new Juice("Trembolona", 1481.00)
        );

        System.out.println("TOTAL GASTO: " + deliveryService.calculateOrderPrice());

    }
}
