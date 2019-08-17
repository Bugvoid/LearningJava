
package projeto_inter;

import java.io.Serializable;

/**
 *
 * @author Kaio.Acha que fez
 */
public class Cilindro  extends Ponto implements Serializable{
    private float raio , altura;

    @Override
    public String toString() {
        return "raio=" + raio + ",\n altura=" + altura + "\nA area:"+areaCili(raio, altura) + "\nO volume:" + volCili(raio, altura);
    }

    
    
    
    public Cilindro(float raio, float altura) {
        this.raio = raio;
        this.altura = altura;
        
        
    }

    public Cilindro() {
        
    }
    public float volCili(float raio, float altura){
        return (float) Math.round((Math.PI * Math.pow(raio,2) * altura));
    }
    public float areaCili(float raio, float altura){
        return (float) Math.round((2 * Math.PI * raio * (raio + altura)));
    }
    
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
