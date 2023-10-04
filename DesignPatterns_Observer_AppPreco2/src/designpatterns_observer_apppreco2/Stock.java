package designpatterns_observer_apppreco2;

/**
 *
 * @author Henrique_Silva
 */
public class Stock extends Subject {
    private String symbol;
    private float preco;

    public Stock(String symbol, float preco) {
        this.symbol = symbol;
        this.preco = preco;
    }

    public String getSymbol() {
        return symbol;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
        notifyObservers();
    }
}