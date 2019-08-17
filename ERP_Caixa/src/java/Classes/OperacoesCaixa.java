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
public class OperacoesCaixa {
   private int Idoperacaocaixa;
   private String data;
   private float valor;

    public OperacoesCaixa(int Idoperacaocaixa, String data, float valor) {
        this.Idoperacaocaixa = Idoperacaocaixa;
        this.data = data;
        this.valor = valor;
    }

    public OperacoesCaixa() {
    }

    public int getIdoperacaocaixa() {
        return Idoperacaocaixa;
    }

    public void setIdoperacaocaixa(int Idoperacaocaixa) {
        this.Idoperacaocaixa = Idoperacaocaixa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
  
  
  
    
}
