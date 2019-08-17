package trabalhadoresempresa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;

/*
 * @author mfpledon
 */
public class TrabalhadoresEmpresa {
    //Armazenaremos os dados dos trabalhores da empresa em um vetor:
    private Trabalhador trab[];
    int N;

    public static void main(String[] args) {
        TrabalhadoresEmpresa principal = new TrabalhadoresEmpresa();
    }

    public TrabalhadoresEmpresa () {
        leituraDeDados();
        mostraTrabalhadoresCadastrados();
        //para testar o mecanismo de serialiação:
        salvar("C:/temp/trabs.dat");
        carregar("C:/temp/trabs.dat");
        mostraTrabalhadoresCadastrados();
    }

    public void leituraDeDados() {
            // para um teste rápido poderíamos considerar dados de 5 trabalhadores fixos:
            N = 5;
            trab = new Trabalhador[5];
            trab[0] = new Trabalhador("João Lopes", 2000f, 'M');
            trab[1] = new Trabalhador("Lilia Peres", 3000f, 'F');
            trab[2] = new Trabalhador("Pedro Silva", 4000f, 'M');
            trab[3] = new Trabalhador("Luis Lima", 5000f, 'M');
            trab[4] = new Trabalhador("Ana Linares", 6000f, 'F');
            /* 
            //Uma lógica para leitura de dados:
            String umNome; float umSalario;  char umSexo;
            N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de trabalhadores:"));
            trab = new Trabalhador[N];   //aloca memória para o vetor
            for (int i=0; i<N; i++){
                      umNome = JOptionPane.showInputDialog( "Digite o nome do trabalhador " + (i+1) + ": ");
                      umSalario = Float.parseFloat(JOptionPane.showInputDialog( "Digite o salário de " + umNome + ": "));
                      umSexo= JOptionPane.showInputDialog( "Digite o sexo deste trabalhador: ").charAt(0);
                      umSexo = Character.toUpperCase(umSexo);
                  trab[i] = new Trabalhador(umNome, umSalario, umSexo); //aloca memória para o objeto (e executa o método construtor com parâmetros)
            }
            */
    }

    public void mostraTrabalhadoresCadastrados () {
        String cad = "";
        for (int i=0; i<N; i++) {
          cad +=  trab[i].toString()+ "\n";
        }
        JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
        outputArea.setText(cad);
            JScrollPane rolagem = new JScrollPane(outputArea);
            JOptionPane.showMessageDialog(null,rolagem,"Dados dos trabalhadores cadastrados",
                                JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean salvar (String filename) {
            //Este método gravará no arquivo filename o conteúdo do vetor de objetos
            //Trabalhador trab[], de tamanho N (atributos globais da classe TrabalhadoresEmpresa).
            try{
                FileOutputStream fos = new FileOutputStream(filename); 
                //veja outros construtores, como: FileOutputStream(String name, boolean append) 
                ObjectOutputStream out = new ObjectOutputStream(fos);
                out.writeObject( "" + N);   //gravamos primeiro o tamanho do vetor (qtde. de trabalhadores)
                for(int i=0; i<N; i++) {
                    out.writeObject( trab[i] );  //gravamos o objeto no arquivo
                }
                out.close();
                fos.close();
            } catch(Exception ex){
                   JOptionPane.showMessageDialog(null, "Erro salvando objetos... " + ex.getMessage());
                   return false; //se deu algum erro, retornaremos false
            }
            return true; //deu tudo certo, retornaremos true
    } //fim do método salvar

    public boolean carregar (String filename) {
            //Este método lerá todos os objetos serializados que existem
            //no arquivo filename e os carregará no vetor Trabalhador trab[], de tamanho N.
            FileInputStream fis;
            ObjectInputStream in;       
            try{
                fis = new FileInputStream(filename);
                in = new ObjectInputStream(fis);
                trab = null;
                // lê a quantidade de objetos:
                N  = Integer.parseInt( (String) in.readObject() );
                trab = new Trabalhador [N];  // alocamos memória para o vetor
                for (int i=0; i<N; i++) { //ciclo para leitura dos objetos
                    // lê um objeto do arquivo e o guarda no vetor:
                    trab[i] = (Trabalhador) in.readObject(); 		
                }
                in.close();
                fis.close();
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro carregando objetos... " + e.getMessage());
                return false;
            }
            return true;     
    } //fim do método carregar


}
