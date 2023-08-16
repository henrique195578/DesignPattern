package br.com.unipar.framework.designerpatterms.comecardoZero;

import br.com.unipar.framework.designerpatterms.abastractFactory.Button;

/**
 *
 * @author Henrique_Silva
 */
public class ComecarDoZeroButton implements Button{
   
   public void render() {
       System.out.println("SELECINOU O COMEÇO DO ZERO BOTÃO!");
   }
}
