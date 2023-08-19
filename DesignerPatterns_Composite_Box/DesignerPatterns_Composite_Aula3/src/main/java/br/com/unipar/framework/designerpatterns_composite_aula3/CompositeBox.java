package br.com.unipar.framework.designerpatterns_composite_aula3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Henrique
 */
public class CompositeBox implements Box {

    private final List<Box> children = new ArrayList<>();
    
    public CompositeBox(Box... boxes){
    children.addAll(Arrays.asList (boxes));
    }
    
    @Override
    public double calculatePrice() {
     return children.stream().mapToDouble(Box::calculatePrice).sum();
    }
    
}
    

