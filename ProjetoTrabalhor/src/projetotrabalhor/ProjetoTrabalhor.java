/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetotrabalhor;

import javax.swing.JOptionPane;

/**
 *
 * @author logonaf
 */
public class ProjetoTrabalhor {

    
    public static void main(String[] args) {
        Trabalhor t1=new Trabalhor("Luan Castro", "9875644589", 19, 'M', "Rua tal", 1500f);
        Trabalhor t2=new Trabalhor("Renata Silva", "1235632585", 20, 'F', "Rua anjinha", 2000f);
        Trabalhor t3=new Trabalhor("Guilerme Death note", "5645644239", 25, 'M', "Rua Otaku", 1500f);
        Trabalhor t4=new Trabalhor("Luana Mendes", "6478365867", 18, 'F', "Rua sei", 1800f);
        
        float mtotal = 0;
        float mmulher = 0;
        int i = 0;
        
        ////////////////////////////////////////////////////////MEDIA TOTAL///////////////////////
        mtotal = (t1.getSalario() + t2.getSalario() + t3.getSalario() + t4.getSalario())/4;
        
        /////////////////////////////////////////////////MEDIA MULHERES//////////////////////////////
        if(t1.getSexo() == 'f' || t1.getSexo() == 'F' ){
            mmulher += t1.getSalario();
            i++;
        }
        if(t2.getSexo() == 'f' || t2.getSexo() == 'F' ){
            mmulher += t2.getSalario();
            i++;
        }
        if(t3.getSexo() == 'f' || t3.getSexo() == 'F' ){
            mmulher += t3.getSalario();
            i++;
        }
        if(t4.getSexo() == 'f' || t4.getSexo() == 'F' ){
            mmulher += t4.getSalario();
            i++;
        }
        float mediam = mmulher / i;
        
        /////////////////////////////////////////////////////MAIOR SALARIO ENTRE OS TRABALHADORES///////////////////////////////////////
        if(t1.getSalario() > t2.getSalario() && t1.getSalario() > t3.getSalario() && t1.getSalario() > t4.getSalario()){
            JOptionPane.showMessageDialog(null, "O maior salario é do trabalhador(a): "+ t1.getNome(), "Maior salario", JOptionPane.INFORMATION_MESSAGE);
        }else
        if(t2.getSalario() > t3.getSalario() && t2.getSalario() > t4.getSalario()){
            JOptionPane.showMessageDialog(null, "O maior salario é do trabalhador(a): "+ t2.getNome(), "Maior salario", JOptionPane.INFORMATION_MESSAGE);
        }else
        if(t3.getSalario() > t4.getSalario()){
            JOptionPane.showMessageDialog(null, "O maior salario é do trabalhador(a): "+ t3.getNome(), "Maior salario", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "O maior salario é do trabalhador(a): "+ t4.getNome(), "Maior salario", JOptionPane.INFORMATION_MESSAGE);
        }
        
     
        JOptionPane.showMessageDialog(null, "A media do salario dos trabalhadores é "+ mtotal, "Media dos trabalhadores", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "A media do salario das mulheres é " + mediam, "Media das mulheres", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
