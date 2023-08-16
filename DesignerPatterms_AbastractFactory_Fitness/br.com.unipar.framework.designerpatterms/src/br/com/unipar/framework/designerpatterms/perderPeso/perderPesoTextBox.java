package br.com.unipar.framework.designerpatterms.perderPeso;

import br.com.unipar.framework.designerpatterms.abastractFactory.TextBox;

/**
 *
 * @author Henrique_Silva
 */
public class perderPesoTextBox implements TextBox{

    @Override
    public void render() {
        System.out.println("Selecionou Perder Peso TextBox!");
    }
    
}
