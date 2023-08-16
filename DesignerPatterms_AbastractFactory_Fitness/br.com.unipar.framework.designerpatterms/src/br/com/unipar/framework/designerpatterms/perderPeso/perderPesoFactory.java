package br.com.unipar.framework.designerpatterms.perderPeso;

import br.com.unipar.framework.designerpatterms.abastractFactory.Button;
import br.com.unipar.framework.designerpatterms.abastractFactory.TextBox;
import br.com.unipar.framework.designerpatterms.abastractFactory.WidgetFactory;

/**
 *
 * @author Henrique_Silva
 */
public class perderPesoFactory implements WidgetFactory{

    @Override
    public Button createButton() {
        return new perderPesoButton();
    }

    @Override
    public TextBox createTextBox() {
        return new perderPesoTextBox();
    }
    
    
}
