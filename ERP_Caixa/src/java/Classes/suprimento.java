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
public class Suprimento {
    private int Id_suprimento;
    private float valor;
    private String data;

    public Suprimento() {
    }

    
    public Suprimento(int Id_sangria, float valor, String data) {
        this.Id_suprimento = Id_sangria;
        this.valor = valor;
        this.data = data;
    }

    public int getId_suprimento() {
        return Id_suprimento;
    }

    public void setId_suprimento(int Id_suprimento) {
        this.Id_suprimento = Id_suprimento;
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
