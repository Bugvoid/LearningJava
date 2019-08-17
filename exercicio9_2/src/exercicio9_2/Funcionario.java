/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9_2;


import javax.swing.JOptionPane;


public class Funcionario {
    private String nome,cpf;
    private Meuvetor salarios;
    
    public void calculaSalariosAnual(){
        float total = 0;
            getSalarios().getX();
            
    }
    public void setSalario(int mes, float sal){
        
}

    public Funcionario() {
        
        leituraAtribudos();
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", salario=" + salarios + '}';
    }

    public Funcionario(String nome, String cpf, Meuvetor salarios) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarios = salarios;
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

    public Meuvetor getSalarios() {
        return salarios;
    }

    public void setSalarios(Meuvetor salarios) {
        this.salarios = salarios;
    }

    
    public void leituraAtribudos(){
        
           nome = JOptionPane.showInputDialog("Digite o nome");
           cpf = JOptionPane.showInputDialog("Digite o CPF");
           salarios = new Meuvetor(12);
           
            
            
           
    }
    
}


