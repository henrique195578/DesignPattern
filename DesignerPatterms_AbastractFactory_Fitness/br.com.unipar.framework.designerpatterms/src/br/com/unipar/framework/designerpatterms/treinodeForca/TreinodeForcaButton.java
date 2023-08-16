package br.com.unipar.framework.designerpatterms.treinodeForca;

import br.com.unipar.framework.designerpatterms.abastractFactory.Button;

/**
 *
 * @author Henrique_Silva
 */
public class TreinodeForcaButton implements Button{

    @Override
    public void render() {
        System.out.println("Selecionou Treino de Força Botão!");    }
    
}
