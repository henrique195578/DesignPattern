package br.com.unipar.framework.designerpatterms.comecardoZero;

import br.com.unipar.framework.designerpatterms.abastractFactory.TextBox;

/**
 *
 * @author Henrique_Silva
 */
public class ComecarDoZeroTextBox implements TextBox{
    
    @Override
    public void render() {
        System.out.println("Começo do Zero TexttBox!");
    }
}
