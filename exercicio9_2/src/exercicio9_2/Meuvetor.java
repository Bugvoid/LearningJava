package exercicio9_2;

import java.util.Vector;
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
public class Meuvetor {
    private float x[];
    private int N;
    
    public Meuvetor(int quant){
       
            N = quant;
            x = new float[N];   //aloca memÃ³ria para o vetor
            float op = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario"));
            for(int i=0;i<N;i++){
                x[i] = op;
            }
            
}

    public float[] getX() {
        return x;
    }

    public void setX(float[] x) {
        this.x = x;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }
    
}

