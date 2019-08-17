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
public class Candidato {
    
    private String cpf,nome,gemusic,sexo;
    private int numCandi,idade;
    

    public Candidato() {
    
    }

    public Candidato(String cpf, String nome, String gemusic, String sexo, int numCandi, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.gemusic = gemusic;
        this.sexo = sexo;
        this.numCandi = numCandi;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGemusic() {
        return gemusic;
    }

    public void setGemusic(String gemusic) {
        this.gemusic = gemusic;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumCandi() {
        return numCandi;
    }

    public void setNumCandi(int numCandi) {
        this.numCandi = numCandi;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void leituraAtribudos(){
           numCandi = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do candidado"));
           nome = JOptionPane.showInputDialog("Digite o nome");
           cpf = JOptionPane.showInputDialog("Digite o CPF");
           idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
           sexo = JOptionPane.showInputDialog("Digite o sexo");
           gemusic = JOptionPane.showInputDialog("Digite o genero musical");
    }
}
