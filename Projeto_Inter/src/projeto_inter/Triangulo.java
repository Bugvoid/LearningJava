package projeto_inter;

import java.io.Serializable;

/**
 *
 * @author Guilherme
 */
public class Triangulo extends Ponto implements Serializable{
    private float Base,ladoa,ladob;
    public float AreaT(float Base,float ladoa,float ladob){   
        float peri= Base+ladoa+ladob;

        float semip= peri/2;
        float at = (float) Math.sqrt(7.5 *(7.5 - Base)+(7.5 - ladoa)+(7.5 - ladob));
        return Math.round(at);
    }
    public float PeriT(float Base,float ladoa,float ladob ){   
        
        return Base+ ladoa + ladob ; 
            }

    public float getBase() {
        return Base;
    }

    public void setBase(float Base) {
        this.Base = Base;
    }

    public float getLadoa() {
        return ladoa;
    }

    public void setLadoa(float ladoa) {
        this.ladoa = ladoa;
    }

    public float getLadob() {
        return ladob;
    }

    public void setLadob(float ladob) {
        this.ladob = ladob;
    }

    @Override
    public String toString() {
        return "Base=" + Base + "\n Ladoa=" + ladoa + "\n Ladob=" + ladob +"\n Perimetro=" + PeriT(Base, ladoa, ladob) + "\n Area=" + AreaT(Base, ladoa, ladob);
    }

    public Triangulo(float Base, float ladoa, float ladob) {
        this.Base = Base;
        this.ladoa = ladoa;
        this.ladob = ladob;
    }

    public Triangulo() {
    }
    
} 
    
