package projetoempresati;

import javax.swing.JOptionPane;

public class Comercial {
    private String nome, cpf;
    private int idade;
    private char sexo;
    private float salario;     

    public Comercial() {
    }

    public Comercial(String nome, String cpf, int idade, char sexo, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    @Override
    public String toString() { // retorna os dados de funcionário do Comercial
        return nome + ", CPF: " + cpf + ", idade: " + idade 
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

    public static Comercial lerDadosComercial() {
        String nome, cpf;
        nome = JOptionPane.showInputDialog(null,"Digite o nome do Comercial","");
        cpf = JOptionPane.showInputDialog(null,"Digite o CPF do Comercial","");
        int idade = Integer.parseInt(
                JOptionPane.showInputDialog(null,"Digite a idade do Comercial",""));
        char sexo = JOptionPane.showInputDialog(null,"Digite o sexo do Comercial","").charAt(0);
        float salario = Float.parseFloat(
                JOptionPane.showInputDialog(null,"Digite o salário do Comercial",""));
        Comercial com = new Comercial(nome, cpf, idade, sexo, salario);
        return com;
    }     
}
