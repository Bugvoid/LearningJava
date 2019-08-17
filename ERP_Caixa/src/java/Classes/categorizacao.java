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
public class Categorizacao {
    private int idCategorizacao;
    private String descricao;

    public Categorizacao() {
    }

    public Categorizacao(int Idconta, String descricao) {
        this.idCategorizacao = Idconta;
        this.descricao = descricao;
    }

    public int getIdCategorizacao() {
        return idCategorizacao;
    }

    public void setIdCategorizacao(int idCategorizacao) {
        this.idCategorizacao = idCategorizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
