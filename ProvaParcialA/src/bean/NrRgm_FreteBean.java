/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import classes.NrRgm_Frete;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class NrRgm_FreteBean {
    public float CalculaFrete(NrRgm_Frete frete){
        float valorapagar=0f;
        float valorpeso = frete.getPeso();
        valorpeso = (valorpeso-(valorpeso%10))/10;
        JOptionPane.showMessageDialog(null, ""+valorpeso);
        if(frete.getEstado().equals("São Paulo")){
            valorpeso = valorpeso * 1.5f;
        }else if(frete.getEstado().equals("Rio de Janeiro")){
            valorpeso = valorpeso * 20f;
        }else if(frete.getEstado().equals("Minas Gerais")){
            valorpeso = valorpeso * 5f;
        }else{
            valorpeso = valorpeso * 15f;
        }
        
        valorapagar = frete.getPeso()*frete.getTipo()+valorpeso;
        
        valorapagar = valorapagar + valorapagar*frete.getPagamento();
        
        return valorapagar;
    }
}
