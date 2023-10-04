package designpatterns_strategy_delivery2;

/**
 *
 * @author Henrique_Silva
 */
public class DogeCoin implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
       
        System.out.println("Forma Pagamento: Você Selecionou DogeCoin(Elon Musk Approves!)");
        
    }
    
}
