/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Luan.Castro
 */
public class Veic {
     private String marca;
     private float km;

    public Veic() {
    }

    public Veic(String marca, float km) {
        this.marca = marca;
        this.km = km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    
    public String toString() {
        return "Veic{" + "marca=" + marca + ", km=" + km + '}';
    }
     
     public void leituraAtribudos(){
           marca = JOptionPane.showInputDialog("Digite a marca do veiculo");
           km = Float.parseFloat(JOptionPane.showInputDialog("Digite o km rodados"));
           
    }
     
}
