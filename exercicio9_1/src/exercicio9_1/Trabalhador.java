/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Luan.Castro
 */
public class Trabalhador {
     private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private float salario;

    public Trabalhador() {
    }

    public Trabalhador(String nome, String cpf, int idade, String sexo, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabalhador{" + "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", sexo=" + sexo + ", salario=" + salario + '}';
    }
    public void leituraAtribudos(){
           nome = JOptionPane.showInputDialog("Digite o nome do Trabalhador");
           cpf = JOptionPane.showInputDialog("Digite o CPF do Trabalhador");
           sexo = JOptionPane.showInputDialog("Digite o sexo do Trabalhador");
           idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Trabalhador,"));
           salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario do Trabalhador,"));
    }
    

    
}
