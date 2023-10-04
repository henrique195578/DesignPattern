package designpatterns_singleton_instanciauser2;

/**
 *
 * @author Henrique_Silva
 */
public class DesignPatterns_Singleton_InstanciaUser2 {

    public static void main(String[] args) {
        
        ConfigManager manager = ConfigManager.getInstance();
        manager.setLoggedInUser("Usuário Logado no Sistema!!!");

        ConfigManager otherManager = ConfigManager.getInstance();
        System.out.println(otherManager.getLoggedInUser());
        
    }
}
    
