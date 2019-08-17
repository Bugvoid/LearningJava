/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic;

/**
 *
 * @author jjeti
 */
public class Disciplinas {
    private String nome;
    private String professor;
    
    public Disciplinas(String nome, String professor){
        this.nome = nome;
        this.professor = professor;
    }
    
    public Disciplinas(){
        this.nome = "";
        this.professor = "";
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
     * @return the professor
     */
    public String getProfessor() {
        return professor;
    }

    /**
     * @param professor the professor to set
     */
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    

}
