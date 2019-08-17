/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_inter;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

    
public class Grau_2 implements Serializable{
   
   private int a,b,c;
   double r1 = 0;
   double r2 = 0;
   int delta = 0;
   

    public Grau_2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
        raizes();
    }

    public Grau_2() {
        
        
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

   
 public String toString() {
     if(Math.sqrt(bask()) > 0){
        return "\n a= " + a + "\n b= " + b 
                + "\n c= " + c + "\n Delta: " + delta +
                "\n Raiz quadrada de delta: "+ Math.sqrt(delta)+"\n 1º Raiz: " + r1 +"\n 2º Raiz: "+r2;
     }else{
         return "Não exite raiz real, Delta = 0";
     }
     
    }
 
 public int bask(){
    return delta = (b*b)+((-4)*(a)*(c));
 } 
 public void raizes(){
         r1 = (-b + Math.sqrt(bask())) / (2*a);
         r2 = (-b - Math.sqrt(bask())) / (2*a);
     }
 }
