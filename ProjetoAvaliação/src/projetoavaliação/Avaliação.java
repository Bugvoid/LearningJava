
package projetoavaliação;

import javax.swing.JOptionPane;

/**
 *
 * @author Luan.Castro
 */
public class Avaliação {
    private String nome;
    private String tpavali;
    private float nmaxi;
    
    public Avaliação(){}
    
    public Avaliação(String nome, String tpavali, float nmaxi) {
        this.nome = nome;
        this.tpavali = tpavali;
        this.nmaxi = nmaxi;
    }
    
    public float calcularperc(){
        float res;
        res = nmaxi/10 * 100;
        return  res;
    }
    @Override
     public String toString() {
        return "Nome da avaliação: " + nome + "\n Tipo de avaliação: " +  tpavali + "\n Nota maxima: "
               + nmaxi+ "\n Percentual da nota final: " + calcularperc()+ "%";
    }
    public void mostrarDados() { 
        JOptionPane.showMessageDialog(null, toString(), 
                    "Avaliação", JOptionPane.INFORMATION_MESSAGE);
    }
    
            
}
