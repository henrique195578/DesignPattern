package br.com.unipar.framework.designerpatterms.construirMusculo;

import br.com.unipar.framework.designerpatterms.abastractFactory.TextBox;

/**
 *
 * @author Henrique_Silva
 */
public class ConstruirMusculoTextBox implements TextBox{
    public void render() {
        System.out.println("Selecionou Construir Musculo TextBox!");
    }
}
