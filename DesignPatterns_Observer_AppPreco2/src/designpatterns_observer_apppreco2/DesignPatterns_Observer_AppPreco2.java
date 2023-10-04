package designpatterns_observer_apppreco2;

import java.util.Arrays;
/**
 *
 * @author Henrique_Silva
 */
public class DesignPatterns_Observer_AppPreco2 {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        Stock acao1 = new Stock("Tampico", 150f);
        Stock acao2 = new Stock("Fanta", 400f);

        StatusBar statusBar = new StatusBar(Arrays.asList(acao1, acao2));
        StockListView stockListView = new StockListView(Arrays.asList(acao1, acao2));

        //SetPrice p/ atualizar o preço
        acao1.setPreco(200f);
        acao2.setPreco(400f);
    }
   
}
   
