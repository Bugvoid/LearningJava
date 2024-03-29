package projetoempresati;

import javax.swing.JOptionPane;

public class Secretario {
    private String nome, cpf, idiomas;
    private int idade;
    private char sexo;
    private float salario; 

    public Secretario() {
    }

    public Secretario(String nome, String cpf, String idiomas, int idade, char sexo, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idiomas = idiomas;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    @Override
    public String toString() { // retorna os dados de um/uma Secretário/a
        return nome + ", CPF: " + cpf + ", idiomas: " 
             + idiomas + ", idade: " + idade 
             + ", sexo: " + sexo + ", sálario: R$ " + salario; 
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the idiomas
     */
    public String getIdiomas() {
        return idiomas;
    }

    /**
     * @param idiomas the idiomas to set
     */
    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public static Secretario lerDadosSecretario() {
        String nome, cpf, idiomas;
        nome = JOptionPane.showInputDialog(null,"Digite o nome do Secretario","");
        cpf = JOptionPane.showInputDialog(null,"Digite o CPF do Secretario","");
        idiomas = JOptionPane.showInputDialog(null,"Digite os idiomas do Secretario","");
        int idade = Integer.parseInt(
                JOptionPane.showInputDialog(null,"Digite a idade do Secretario",""));
        char sexo = JOptionPane.showInputDialog(null,"Digite o sexo do Secretario","").charAt(0);
        float salario = Float.parseFloat(
                JOptionPane.showInputDialog(null,"Digite o salário do Secretario",""));
        Secretario sec = new Secretario(nome, cpf, idiomas, idade, sexo, salario);
        return sec;
    }    
}
