/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursomusical;

import javax.swing.JOptionPane;

/**
 *
 * @author logonaf
 */
public class Juri {
    private String nome,nomeart,gemusic;

    public Juri() {
    }

    public Juri(String nome, String nomeart, String gemusic) {
        this.nome = nome;
        this.nomeart = nomeart;
        this.gemusic = gemusic;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nomeart
     */
    public String getNomeart() {
        return nomeart;
    }

    /**
     * @param nomeart the nomeart to set
     */
    public void setNomeart(String nomeart) {
        this.nomeart = nomeart;
    }

    /**
     * @return the gemusic
     */
    public String getGemusic() {
        return gemusic;
    }

    /**
     * @param gemusic the gemusic to set
     */
    public void setGemusic(String gemusic) {
        this.gemusic = gemusic;
    }

    
    public String toString() {
        return ("Nome: " + nome + ", nome artistico: " + nomeart + ", genero musical: " + gemusic ); 
    }
    public void leituraAtribudos(){
           nome = JOptionPane.showInputDialog("Digite o nome do Juri");
           nomeart = JOptionPane.showInputDialog("Digite o nome artistico");
           gemusic = JOptionPane.showInputDialog("Digite o genero musical");
           
    }
    
    
}
