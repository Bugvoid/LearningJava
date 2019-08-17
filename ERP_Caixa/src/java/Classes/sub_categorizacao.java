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
public class sub_categorizacao {
   private int Idsupcategorizacao;
   private String descricao;

    public sub_categorizacao() {
    }

    public sub_categorizacao(int Idsupcategorizacao, String descricao) {
        this.Idsupcategorizacao = Idsupcategorizacao;
        this.descricao = descricao;
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
   
   
}
