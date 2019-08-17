package bean;

import classe.Voto;
import dao.consultas;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import view.Pesquisa;
import view.Urna;
import classe.Login;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Bean {

    consultas c = new consultas();
    classe.Login l = new Login();
    classe.Voto v = new Voto();

    public String Votar(Voto v) {
        return "Fim";
    }

    public void entrar(String login, String senha) {
        l.setLogin(login);
        l.setSenha(senha);
        boolean g = c.Mesario(login, senha);
      if(g == true){
         Urna voto = new Urna();
            voto.setLocation(50, 50);
            voto.setVisible(true);
            voto.setLocationRelativeTo(null);
      } else {
            JOptionPane.showMessageDialog(null, "Usuario ou senha inválido");
        }
     }
    public void libera(){
        Pesquisa voto = new Pesquisa();
            voto.setLocation(50, 50);
            voto.setVisible(true);
            voto.setLocationRelativeTo(null);
    }
    public boolean liberar(JTextField l) {
        boolean result = false;
        v.setTitulo(l.getText());
        
        boolean resultado = false;
        resultado = c.verificaTitu(l.getText());
       
        
        if (resultado) {
            l.setText("");
            result = true;
        } else {
            JOptionPane.showMessageDialog(null, "Seção ou Zona Incompativeis");
            l.setText("");
            result = false;
        }
        return result;
    }

    public void pesquisa(String val, JLabel txt_nome, JLabel imagem,int cargo,JLabel partido) {
       c.verificaCandi(val, txt_nome,imagem,cargo,partido);
        }

    public boolean SairPrograma() {
            boolean bo = false;
        Object[] options = {"Confirmar", "Cancelar"};
        int opcao = JOptionPane.showOptionDialog(null, "Tem certeza que quer sair", "Sair", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (opcao == (0)) {
            bo =  true; 
            
        }else if(opcao == (1)){
            bo = false;
        }
        return bo;
     }
    
    public void Som(String soundName)
 {
   try 
   {
   AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
   Clip clip = AudioSystem.getClip( );
   clip.open(audioInputStream);
   clip.start( );
   }
   catch(Exception ex)
   {
     System.out.println("Error with playing sound.");
     ex.printStackTrace( );
   }
 }
}
