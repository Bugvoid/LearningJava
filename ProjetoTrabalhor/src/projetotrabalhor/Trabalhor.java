
package projetotrabalhor;
    

public class Trabalhor {
    private String nome;
    private String cpf;
    private int idade;
    private char sexo;
    private String end;
    private float salario;
    
    public Trabalhor(){
            nome ="";
            cpf="";
            idade=0; 
            sexo='-';
            salario =0;
    }
    public Trabalhor(String inNome,String inCpf,int inIdade,char inSexo,String inEnd,float inSalario){
        setNome(inNome);
        setCpf(inCpf);
        setIdade(inIdade);
        setSexo(inSexo);
        setEnd(inEnd);
        setSalario(inSalario);
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

   
    public char getSexo() {
        return sexo;
    }

    
    public void setSexo(char inSexo) {
        sexo= '-';
        if(inSexo=='F' || inSexo=='M')sexo = inSexo;
    }
    
    
    public String getEnd() {
        return end;
    }

   
    public void setEnd(String end) {
        this.end = end;
    }

   
    public float getSalario() {
        return salario;
    }
    public String getSalarioStr(){
        return ("R$" + salario);
    }
    
    public void setSalario(float inSalario) {
        if(inSalario>0)salario = inSalario;
        else salario=0;
    }
   
}
