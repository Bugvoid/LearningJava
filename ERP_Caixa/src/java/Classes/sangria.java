/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Luan.Castro
 */
public class Sangria {
    private int Id_sangria;
    private float valor;
    private String data;

    public Sangria() {
    }

    public Sangria(int Id_suprimento, float valor, String data) {
        this.Id_sangria = Id_suprimento;
        this.valor = valor;
        this.data = data;
    }

    public int getId_sangria() {
        return Id_sangria;
    }

    public void setId_sangria(int Id_sangria) {
        this.Id_sangria = Id_sangria;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
