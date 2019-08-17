public class Pessoa {
     private String nome,senha,tp_senha; 
     private int idade, cpf;

    public Pessoa() {
    }
     
    public Pessoa(String nome, int idade, int cpf, String senha, String tp_senha) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.senha = senha;
        this.tp_senha = tp_senha;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTp_senha() {
        return tp_senha;
    }

    public void setTp_senha(String tp_senha) {
        this.tp_senha = tp_senha;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", senha=" + senha + ", tp_senha=" + tp_senha;
    }
}
