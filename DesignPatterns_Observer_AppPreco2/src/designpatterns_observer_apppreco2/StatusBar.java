package designpatterns_observer_apppreco2;

import java.util.List;

/**
 *
 * @author Henrique_Silva
 */
public class StatusBar implements Observer {
    private List<Stock> favoriteStocks; 

    public StatusBar(List<Stock> favoriteStocks) {
        this.favoriteStocks = favoriteStocks;

        for (Stock stock : favoriteStocks) {
            stock.addObserver(this);
        }
    }

    @Override
    public void update() {
        System.out.println("\n StatusBar: ");
        for (Stock stock : favoriteStocks) {
            System.out.println(stock.getSymbol() + " - " + stock.getPreco());
        }
    }
}
