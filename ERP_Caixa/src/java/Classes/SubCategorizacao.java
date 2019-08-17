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
public class SubCategorizacao {
   private int Idsupcategorizacao, Categorizacao_idCategorizacao;
   private String descricao,categorizacao;
   

    public SubCategorizacao() {
    }

    public SubCategorizacao(int Idsupcategorizacao, int Categorizacao_idCategorizacao, String descricao, String categorizacao) {
        this.Idsupcategorizacao = Idsupcategorizacao;
        this.Categorizacao_idCategorizacao = Categorizacao_idCategorizacao;
        this.descricao = descricao;
        this.categorizacao = categorizacao;
    }

    

    public String getCategorizacao() {
        return categorizacao;
    }

    public void setCategorizacao(String categorizacao) {
        this.categorizacao = categorizacao;
    }

    

    public int getIdsupcategorizacao() {
        return Idsupcategorizacao;
    }

    public void setIdsupcategorizacao(int Idsupcategorizacao) {
        this.Idsupcategorizacao = Idsupcategorizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCategorizacao_idCategorizacao() {
        return Categorizacao_idCategorizacao;
    }

    public void setCategorizacao_idCategorizacao(int Categorizacao_idCategorizacao) {
        this.Categorizacao_idCategorizacao = Categorizacao_idCategorizacao;
    }
   
   
}
