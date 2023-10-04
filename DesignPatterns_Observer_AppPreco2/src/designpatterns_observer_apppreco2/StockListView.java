package designpatterns_observer_apppreco2;

import java.util.List;

/**
 *
 * @author Henrique_Silva
 */

public class StockListView implements Observer {
    private List<Stock> stocks;

    public StockListView(List<Stock> stocks) {
        this.stocks = stocks;

        for (Stock stock : stocks) {
            stock.addObserver(this);
        }
    }

    @Override
    public void update() {
        System.out.println("\n StockListView: ");
        for (Stock stock : stocks) {
            System.out.println(stock.getSymbol() + " - " + stock.getPreco());
        }
    }
}
