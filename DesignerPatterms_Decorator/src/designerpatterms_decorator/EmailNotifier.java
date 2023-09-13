package designerpatterms_decorator;

/**
 *
 * @author Henrique_Silva
 */
public class EmailNotifier implements Notifier{

    @Override
    public void sendNottification(String message) {
        System.out.println("Enviando Email: " + message);
    }
    
}
