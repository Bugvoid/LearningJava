
import com.sun.org.apache.xpath.internal.Arg;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luan.Castro
 */
public class Pilha {
     int vet[],topo,n;
     char vet2[];
    
     public static void main(String[] arg){
         Pilha p = new Pilha();
     }

    public Pilha() {
        

        inverte();
        valida();
    }
    
    
    public void inverte(){
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da pilha"));
        vet = new int[n];
        topo = -1;
        
        String vish = "";
      for(int i = 0; i < n; i++){
          int html= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 9"));
          if(html >= 10){
              JOptionPane.showMessageDialog(null,"EU FALEI DE 1 a 9!,eu decido pra voce agora");
             Random r = new Random();
              html = r.nextInt(9);
              push(html);
          }else
          push(html);
          
      }
 
      
       for(int i = n-1; i>=0; i--){
           vish += vet[i];
       } 
        JOptionPane.showMessageDialog(null,"Invertido " + vish);
        
    }
    public void valida() {
        
        int power = -1;
        vet2 = new char[n];
        topo = -1;
        
        
         for (int i = 0; i < vet2.length; i++) {
             
             String vai = JOptionPane.showInputDialog("Digite uma expresão");
            char expres = vai.charAt(0);
             if(expres == '(' || expres == '[' || expres == '{'){
                 push2(expres);
                 power++;
              
             }else{ 
                 if (expres == ')' || expres == ']' || expres == '}') {
                     if (vet2[i-1] == '(' || vet2[i-1] == '[' || vet2[i-1] == '{') {
                         pop2();
                         power--;
                     }
                 } 
             
                }
             
         
         }
            System.out.println(power);
         if(power == 0){
             JOptionPane.showMessageDialog(null, "Valido");
         }else{
             JOptionPane.showMessageDialog(null, "Invalido");
         }
    }
    
    public void push(int dado){
        if(topo == n-1){
            JOptionPane.showMessageDialog(null, "Pilha cheia");
        }else{
            topo++;
            vet[topo] = dado;
        }
    }
    public void push2(char dado2){
        if(topo == n-1){
            JOptionPane.showMessageDialog(null, "Pilha cheia");
        }else{
            topo++;
            vet2[topo] = dado2;
        }
    }

    
    public int pop (){
        int resp = 0;
        if(topo == -1){
            JOptionPane.showMessageDialog(null, "Pilha vazia");
        }else{
            resp = vet[topo];
            topo--;
        }
        return resp;
    }
    public int pop2 (){
        int resp = 0;
        if(topo == -1){
            JOptionPane.showMessageDialog(null, "Pilha vazia");
        }else{
            resp = vet2[topo];
            topo--;
        }
        return resp;
    }

    
}
