package projetoempresati;

import javax.swing.*;

public class Programador {

    private String nome, cpf, cargo, nivelCargo, linguagem;
    private int idade;
    private char sexo;
    private float salario;

    public Programador() {
    }

    public Programador(String nome, String cpf, String cargo,
            String nivelCargo, String linguagem, int idade,
            char sexo, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.nivelCargo = nivelCargo;
        this.linguagem = linguagem;
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nome + ", CPF: " + cpf + ", cargo: " + cargo
                + ", nível do cargo: " + nivelCargo + ", linguagem: "
                + linguagem + ", idade: " + idade
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
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the nivelCargo
     */
    public String getNivelCargo() {
        return nivelCargo;
    }

    /**
     * @param nivelCargo the nivelCargo to set
     */
    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    /**
     * @return the linguagem
     */
    public String getLinguagem() {
        return linguagem;
    }

    /**
     * @param linguagem the linguagem to set
     */
    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
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

    public static Programador lerDadosProgramador() {
        String nome, cpf, cargo, nivelCargo, linguagem;
        nome = JOptionPane.showInputDialog(null,"Digite o nome do Programador","");
        cpf = JOptionPane.showInputDialog(null,"Digite o CPF do Programador","");
        cargo = JOptionPane.showInputDialog(null,"Digite o cargo do Programador","");
        nivelCargo = JOptionPane.showInputDialog(null,"Digite o nível do cargo do Programador","");  
        linguagem = JOptionPane.showInputDialog(null,"Digite a linguagem principal do Programador","");
        int idade = Integer.parseInt(
                JOptionPane.showInputDialog(null,"Digite a idade do Programador",""));
        char sexo = JOptionPane.showInputDialog(null,"Digite o sexo do Programador","").charAt(0);
        float salario = Float.parseFloat(
                JOptionPane.showInputDialog(null,"Digite o salário do Programador",""));
        Programador p = new Programador(nome, cpf, cargo, nivelCargo, linguagem, idade, sexo, salario);
        return p;
    }

}
