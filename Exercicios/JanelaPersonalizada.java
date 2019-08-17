/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan.Castro
 */
public class JanelaPersonalizada extends JFrame{
    //Saudades de HTML e JAVASCRIPT;
    

    public JanelaPersonalizada(String titu,String txt, int x, int y) {
        
        setTitle(titu);
        setSize(x, y);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLabel(txt);
        setVisible(true);
        this.add(jl);
    }
    public static void main(String[] args) {
        
        String titu = JOptionPane.showInputDialog("Digite o Titulo");
        String txt = JOptionPane.showInputDialog("Digite um texto");
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura"));
        JanelaPersonalizada  jn = new JanelaPersonalizada(titu,txt,x,y);
        
    }
    
    

   
}
