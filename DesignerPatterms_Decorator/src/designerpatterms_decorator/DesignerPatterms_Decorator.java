package designerpatterms_decorator;

/**
 *
 * @author Henrique_Silva
 */
public class DesignerPatterms_Decorator {
    public static void main(String[] args) {
        
        Notifier notifier = new EmailNotifier();
        
        notifier = new SMSDecorator(notifier);
        
        notifier = new WhatsAppDecorator(notifier);
        
        notifier.sendNottification("Pedido recebido");
        System.out.println();
        
        notifier = new SMSDecorator(new EmailNotifier());
        notifier.sendNottification("Pagamento efetuado.");
        
       
    }
    
}
