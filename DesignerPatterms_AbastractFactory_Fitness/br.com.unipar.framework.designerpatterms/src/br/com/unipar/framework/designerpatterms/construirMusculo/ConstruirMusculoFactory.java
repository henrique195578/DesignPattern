package br.com.unipar.framework.designerpatterms.construirMusculo;

import br.com.unipar.framework.designerpatterms.abastractFactory.Button;
import br.com.unipar.framework.designerpatterms.abastractFactory.TextBox;
import br.com.unipar.framework.designerpatterms.abastractFactory.WidgetFactory;

/**
 *
 * @author Henrique_Silva
 */
public class ConstruirMusculoFactory implements WidgetFactory{
    
    @Override
    public Button createButton() {
        return new ConstruirMusculoButton();
    }

    @Override
    public TextBox createTextBox() {
        return new ConstruirMusculoTextBox();
    }
}
