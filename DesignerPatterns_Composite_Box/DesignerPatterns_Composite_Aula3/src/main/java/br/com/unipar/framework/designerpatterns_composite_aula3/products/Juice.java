package br.com.unipar.framework.designerpatterns_composite_aula3.products;

/**
 *
 * @author Henrique
 */
public class Juice extends Product{

    public Juice(String title, double price) {
        super(title, price);
    }


    @Override
    public double calculatePrice() {
        return getPrice();
    }
    
}
