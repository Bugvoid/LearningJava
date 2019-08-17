/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Classes.Total;
import Classes.Mensagem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author logonaf
 */
public class MensagemBean {
    
    public void ModificarLabel(Mensagem mensagem,JLabel label){
        label.setText(mensagem.getMsg());
        label.setFont (new Font("Arial",Font.PLAIN,(mensagem.getTamanho())));
        label.setToolTipText(mensagem.getTooltip());
        
        switch(mensagem.getCor()){
            case "Branco":
                label.setForeground(Color.WHITE);
            break;
            case "Preto":
                label.setForeground(Color.BLACK);
                break;
                case "Verde":
                label.setForeground(Color.GREEN);
                break;
                case "Vermelho":
                label.setForeground(Color.RED);
                break;
                case "Amarelo":
                label.setForeground(Color.YELLOW);
                break;
                case "Azul":
                label.setForeground(Color.BLUE);
                break;
                default:
                label.setForeground(Color.PINK);
                
        }
    }
    public void AtualizarValor(Total total,JTextField tex){
        String a = String.valueOf(total.getTotal());
        a = a.replace(".",",");
        tex.setText("R$ "+a);
      
        //textFild.setText(mensag.setTipo());
        
        
    }
}
