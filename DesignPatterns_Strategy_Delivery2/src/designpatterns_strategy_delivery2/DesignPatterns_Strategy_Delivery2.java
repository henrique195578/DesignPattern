package designpatterns_strategy_delivery2;

/**
 *
 * @author Henrique_Silva
 */
public class DesignPatterns_Strategy_Delivery2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaymentStorage paymentStorage = new PaymentStorage();
        
        paymentStorage.store("Selecionado:", new FormaPagamentoAleatoria());
        paymentStorage.store("Selecionado:", new DogeCoin());
        paymentStorage.store("Selecionado: ", new Dinheiro());
        paymentStorage.store("Selecionado: ", new PayPal());
        paymentStorage.store("Selecionado: ", new Bitcoin());
        
    }
}
    
