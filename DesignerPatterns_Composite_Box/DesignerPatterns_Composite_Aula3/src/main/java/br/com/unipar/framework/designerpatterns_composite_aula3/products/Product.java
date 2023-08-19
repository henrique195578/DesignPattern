package br.com.unipar.framework.designerpatterns_composite_aula3.products;

import br.com.unipar.framework.designerpatterns_composite_aula3.Box;
import lombok.Data;

/**
 *
 * @author Henrique
 */
@Data
public abstract class Product implements Box{
    
    protected final String title;
    protected final double price;
}
