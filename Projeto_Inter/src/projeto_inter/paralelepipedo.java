 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_inter;

import java.io.Serializable;

/**
 *
 * @author logonaf
 */
public class paralelepipedo extends Ponto implements Serializable{
    private float largura, altura, comprimento;

    public paralelepipedo() {
    }

    public paralelepipedo(float largura, float altura, float comprimento) {
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    /**
     * @return the largura
     */
    public float getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(float largura) {
        this.largura = largura;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
    public float getArea(){
        return 2 * (largura*altura + largura*comprimento + altura*comprimento);
    }
    
    public float getVolume(){
        return largura*altura*comprimento ; 
    }

    @Override
    public String toString() {
        return  "largura=" + largura + ",\naltura=" + altura 
                + ", \ncomprimento=" + comprimento 
                + ",\narea total="+getArea()+",\nVolume="+getVolume();
    }


    
            
}
