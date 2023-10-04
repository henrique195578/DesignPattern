package designpatterns_strategy_delivery2;

/**
 *
 * @author Henrique_Silva
 */
public class PayPal implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
        
        System.out.println("Forma Pagamento: Selecionou PayPal");
        
    }
 }