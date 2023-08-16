package br.com.unipar.framework.designerpatterms.comecardoZero;

import br.com.unipar.framework.designerpatterms.abastractFactory.Button;
import br.com.unipar.framework.designerpatterms.abastractFactory.TextBox;
import br.com.unipar.framework.designerpatterms.abastractFactory.WidgetFactory;

/**
 *
 * @author Henrique_Silva
 */
public class ComecarDoZeroFactory implements WidgetFactory{
    
    @Override
    public Button createButton(){
        return new ComecarDoZeroButton();
    }
    
    @Override
    public TextBox createTextBox(){
        return new ComecarDoZeroTextBox();
    }
}
