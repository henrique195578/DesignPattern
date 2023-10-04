package designpatterns_observer_apppreco2;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Henrique_Silva
 */
public class Subject {
    
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    
}
