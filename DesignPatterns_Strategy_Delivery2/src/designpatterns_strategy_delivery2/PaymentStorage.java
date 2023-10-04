package designpatterns_strategy_delivery2;

/**
 *
 * @author Henrique_Silva
 */
public class PaymentStorage {
    
    public void store(String dsPagamento, FormaPagamento formaPagamento) {
        formaPagamento.pagamento(dsPagamento);
    }
    
}
