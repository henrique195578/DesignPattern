package designpatterns_adapters_email;

import designpatterns_adapters_email.gmailClient.GmailClient;

/**
 *
 * @author Henrique_Silva
 */
public class DesignPatterns_Adapters_Email {

    public static void main(String[] args) {
        
        GmailClient gmailClient = new GmailClient();
        EmailProvider gmailAdapter = new GmailAdapter(gmailClient); 
        EmailClient emailClient = new EmailClient(gmailAdapter); 
        
        emailClient.connectToEmail();
        emailClient.fetchEmails();
    }
    
}
