package designerpatterms_factorymethod_appburguer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Henrique_Silva
 */
public abstract class Hamburger {
    private String nome;
    private String pao;
    private String carne;
    private List<String> ingredientes;

    public Hamburger(String nome, String pao, String carne) {
        this.nome = nome;
        this.pao = pao;
        this.carne = carne;
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void preparar() {
        System.out.println("Preparando " + nome);
        System.out.println("Pão: " + pao);
        System.out.println("Carne: " + carne);
        System.out.println("Ingredientes:");
        for (String ingrediente : ingredientes) {
            System.out.println(ingrediente);
        }
    }

    public abstract void servir();
}

    

