package br.com.unipar.framework.designerpatterms.treinodeForca;

import br.com.unipar.framework.designerpatterms.abastractFactory.TextBox;

/**
 *
 * @author Henrique_Silva
 */
public class TreinodeForcaTextBox implements TextBox{

    @Override
    public void render() {
        System.out.println("Selecionou Treino de Força Textbox!");
    }
    
}
