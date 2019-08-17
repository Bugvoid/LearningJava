/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_inter;

import java.io.Serializable;

/**
 *
 * @author Luan.Castro
 */
public class Ponto implements Serializable{
    private float xa,xb,ya,yb;

    public Ponto() {
    }

    public Ponto(float xa, float xb, float ya, float yb) {
        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
    }

    @Override
    public String toString() {
        return "\nxa=" + xa + "\nxb=" + xb 
                + "\nya=" + ya + "\nyb=" + yb 
                +"\nA distancia entre os dois pontos: "
                +distan(xa, xb, ya, yb);
    }

    
    
    public float distan(double xa,double xb,double ya, double yb){
        return (float) Math.round(Math.sqrt(Math.pow((xb-xa),2) + Math.pow((yb-ya),2)));
    }

    public float getXa() {
        return xa;
    }

    public void setXa(float xa) {
        this.xa = xa;
    }

    public float getXb() {
        return xb;
    }

    public void setXb(float xb) {
        this.xb = xb;
    }

    public float getYa() {
        return ya;
    }

    public void setYa(float ya) {
        this.ya = ya;
    }

    public float getYb() {
        return yb;
    }

    public void setYb(float yb) {
        this.yb = yb;
    }

    
    
    
    
}
