package br.com.unipar.framework.designerpatterms.perderPeso;

import br.com.unipar.framework.designerpatterms.abastractFactory.Button;

/**
 *
 * @author Henrique_Silva
 */
public class perderPesoButton implements Button{

    @Override
    public void render() {
        System.out.println("Selecionou Perder Peso Botão!");
    }
    
    
}
