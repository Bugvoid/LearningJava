/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoavaliação;

/**
 *
 * @author Luan.Castro
 */
public class ProjetoAvaliação {

    public static void main(String[] args) {
        Avaliação a = new Avaliação("PR", "Prova Parcial", 5.0f);
        Avaliação b = new Avaliação("PP1", "Exercicio", 2.5f);
        Avaliação c = new Avaliação("PP2", "Projeto", 2.5f);
        a.mostrarDados();
        b.mostrarDados();
        c.mostrarDados();
    }
    
}
