package br.com.unipar.framework.designerpatterms.treinodeForca;

import br.com.unipar.framework.designerpatterms.abastractFactory.Button;
import br.com.unipar.framework.designerpatterms.abastractFactory.TextBox;
import br.com.unipar.framework.designerpatterms.abastractFactory.WidgetFactory;

/**
 *
 * @author Henrique_Silva
 */
public class TreinodeForcaFactory implements WidgetFactory{

    @Override
    public Button createButton() {
        return new TreinodeForcaButton();
    }

    @Override
    public TextBox createTextBox() {
        return new TreinodeForcaTextBox();
    }
    
}
