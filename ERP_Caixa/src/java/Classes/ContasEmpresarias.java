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
public class ContasEmpresarias {
    private int IdContaE;
    private String descricao;
    private float valorinicial;

    public ContasEmpresarias(int IdContaE, String descricao, float valorinicial) {
        this.IdContaE = IdContaE;
        this.descricao = descricao;
        this.valorinicial = valorinicial;
    }

    public ContasEmpresarias() {
    }

    public int getIdContaE() {
        return IdContaE;
    }

    public void setIdContaE(int IdContaE) {
        this.IdContaE = IdContaE;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorinicial() {
        return valorinicial;
    }

    public void setValorinicial(float valorinicial) {
        this.valorinicial = valorinicial;
    }
    
    
}
