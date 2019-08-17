import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Logica {
    FilaBanco fila = new FilaBanco();
    Pessoa pesso = new Pessoa();
    ArrayList<String> trap = new ArrayList();
   
    int piruzine = 0;

    public String inserirFila(Pessoa pesso){
        String resp = "";        
        
        if(pesso.getTp_senha().equalsIgnoreCase("Prioridade")){
            fila.Senha_privata(pesso.getSenha(),piruzine);
             trap.add(piruzine,pesso.toString());
            piruzine++;
            
        }else{
            fila.Senha(pesso.getSenha());
             trap.add(pesso.toString());
         }
       
        resp = "Senha registrada";
        return resp;
           }
    public void cadastrar(JTextField nome,JTextField idade,JTextField cpf,String tiposenha,String senha){
        String t = null;
       String Nome = nome.getText();
        int Idade = Integer.parseInt(idade.getText());
        int Cpf = Integer.parseInt(cpf.getText());
        pesso.setNome(Nome);
        pesso.setCpf(Cpf);
        pesso.setSenha(senha);
        pesso.setTp_senha(tiposenha);
        pesso.setIdade(Idade);
        inserirFila(pesso);
        
    }
    
    public String apolinario(){
         
         
    JOptionPane.showMessageDialog(null,"Dados" +trap.remove(0));
    String senha = String.valueOf(fila.xau_2());
    return senha;
    }
    public void verificar(){
    JOptionPane.showMessageDialog(null,trap.toString());
    }
    
}
