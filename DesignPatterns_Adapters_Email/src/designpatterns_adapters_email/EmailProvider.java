package designpatterns_adapters_email;

/**
 *
 * @author Henrique_Silva
 */
public interface EmailProvider {

   void connect();
    void getEmails();
    void fetchEmails();
}