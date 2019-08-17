/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Classes.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Luan.Castro
 */
public class CaixaDAO {
    
    public String excluirSubCategoria(int id){
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            String sql = "DELETE FROM `caixa`.`sub_categorizacao` WHERE `idSub_Categorizacao`=? ";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.execute();
            ps.close();
            con.close();
            resp = "Sub-Categoria Excluída com Sucesso!!!";
            
        }catch(Exception ex){
            resp = "Existe Relação com essa Sub-Categoria: ";
        }
        return resp;
    }
    
    public String excluirCategoria(int id){
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            String sql = "DELETE FROM `categorizacao` WHERE `idCategorizacao`=?;";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.execute();
            ps.close();
            con.close();
            resp = "Categoria Excluída com Sucesso!!!";
            
        }catch(Exception ex){
            resp = "Essa categoria nao pode ser excluida pois contem registros de subcategoria";
        }
        return resp;
    }
    
    public String excluirContaEMP(int id){
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            String sql = "DELETE FROM `contas_empresariais` WHERE `idContas_Empresariais`=?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.execute();
            ps.close();
            con.close();
            resp = "Conta Excluída com Sucesso!!!";
            
        }catch(Exception ex){
            resp = "Essa conta não pode ser excluida pois contém registros ";
        }
        return resp;
    }
    
    public String alterarSubcatego(SubCategorizacao ct, int id){
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            String sql = "UPDATE `sub_categorizacao` SET `Descricao`= ? WHERE `idSub_Categorizacao`= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
           
            
            ps.setString(1, ct.getDescricao());
            ps.setInt(2, id);
            
            ps.execute();
            ps.close();
            con.close();
            resp = "SubCategoria Alterado com Sucesso!!!";
            
        }catch(Exception ex){
            resp = "Erro: " + ex.getMessage();
        }
        return resp;
    }
    
    public String alterarCatego(Categorizacao ct,int id){
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            String sql = "UPDATE `categorizacao` SET `Descricao`= ? WHERE `idCategorizacao`= ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, ct.getDescricao());
            ps.setInt(2, id);
            
            ps.execute();
            ps.close();
            con.close();
            resp = "Categoria Alterado com Sucesso!!!";
            
        }catch(Exception ex){
            resp = "Erro: " + ex.getMessage();
        }
        return resp;
    }
    
    public String alterarContaEMP(ContasEmpresarias ct, int id){
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            String sql = "UPDATE `contas_empresariais` SET `Descricao`=?, `Saldoinicial`=? WHERE `idContas_Empresariais`= ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, ct.getDescricao());
            ps.setFloat(2, ct.getValorinicial());
            ps.setInt(3, id);
            
            ps.execute();
            ps.close();
            con.close();
            resp = "Conta Alterado com Sucesso!!!";
            
        }catch(Exception ex){
            resp = "Erro: " + ex.getMessage();
        }
        return resp;
    }
    
    
   public Pedido selecionarpedido(int idpedido){
        
        Pedido pedi = new Pedido();
        try{
            Connection con = Conecta.getConexao();
            String sql = "SELECT Id_pedido, ValorTotalPedido, Forma_pagamento from pedido WHERE id_pedido = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idpedido);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                pedi.setValorTotalPedido(rs.getFloat("ValorTotalPedido"));
                pedi.setForma_pagamento(rs.getString("Forma_pagamento"));
            }
            
        }catch(Exception ex){
            pedi = null;
        }
        
        return pedi;
    }
    
   public ArrayList<SubCategorizacao> getSubCategoria(){
        ArrayList<SubCategorizacao> lista = new ArrayList<>();
        try{
            Connection con = Conecta.getConexao();
            String sql = "select sub_categorizacao.idSub_Categorizacao, sub_categorizacao.Descricao, categorizacao.Descricao from sub_categorizacao inner join categorizacao on sub_categorizacao.Categorizacao_idCategorizacao = categorizacao.idCategorizacao";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                SubCategorizacao subcatego = new SubCategorizacao();
                subcatego.setIdsupcategorizacao(rs.getInt("sub_categorizacao.idSub_Categorizacao"));
                subcatego.setDescricao(rs.getString("sub_categorizacao.Descricao"));
                subcatego.setCategorizacao(rs.getString("categorizacao.Descricao"));
                lista.add(subcatego);  
            }
        }catch(Exception ex){
            lista = null;
        }
        
        return lista;
    }
   
   public ArrayList<Categorizacao> getCategoria(){
        ArrayList<Categorizacao> lista = new ArrayList<>();
        try{
            Connection con = Conecta.getConexao();
            String sql = "SELECT idCategorizacao, Descricao FROM categorizacao";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Categorizacao catego = new Categorizacao();
                catego.setIdCategorizacao(rs.getInt("idCategorizacao"));
                catego.setDescricao(rs.getString("Descricao"));
                lista.add(catego);  
            }
        }catch(Exception ex){
            lista = null;
        }
        
        return lista;
    }
   
    public ArrayList<ContasEmpresarias> getContaEmpresariais(){
        ArrayList<ContasEmpresarias> lista = new ArrayList<>();
        try{
            Connection con = Conecta.getConexao();
            String sql = "SELECT idContas_Empresariais, Descricao, Saldoinicial FROM contas_empresariais;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                ContasEmpresarias ct = new ContasEmpresarias();
                ct.setIdContaE(rs.getInt("idContas_Empresariais"));
                ct.setDescricao(rs.getString("Descricao"));
                ct.setValorinicial(rs.getFloat("Saldoinicial"));
                lista.add(ct);  
            }
        }catch(Exception ex){
            lista = null;
        }
        
        return lista;
    }
    
    public String inserirContaEmp(ContasEmpresarias ct){
        String resp;
        try{
            Connection con = Conecta.getConexao(); // método que faz a conexão 
            String sql = "INSERT INTO contas_empresariais (Descricao, Saldoinicial) VALUES (?, ?)";
            

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ct.getDescricao());
            ps.setFloat(2, ct.getValorinicial());

            ps.execute(); 
            ps.close(); 
            con.close(); 
            
            resp = "Dados salvos com sucesso!!!";
            
        }catch(Exception ex){
            
            resp = "Erro " + ex.getMessage();
        
        }
        return resp;
    }
    public String finalizaropera(OperacoesCaixa opera){
        String resp;
        try{
            Connection con = Conecta.getConexao(); // método que faz a conexão 
            String sql = "INSERT INTO operacao_caixa (Data, Valor, Sub_categorizacao_idSub_categorizacao, Contas_Empresariais_idContas_Empresariais) VALUES (CURDATE(), ?, '1', '1')";
            

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, opera.getValor());

            ps.execute(); 
            ps.close(); 
            con.close(); 
            
            resp = "Dados salvos com sucesso!!!";
            
        }catch(Exception ex){
            
            resp = "Erro " + ex.getMessage();
        
        }
        return resp;
    }
    public String inserirCategoria(Categorizacao catego){
        String resp;
        try{
            Connection con = Conecta.getConexao(); // método que faz a conexão 
            String sql = "INSERT INTO categorizacao(Descricao) VALUES(?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, catego.getDescricao());

            ps.execute(); 
            ps.close(); 
            con.close(); 
            
            resp = "Dados salvos com sucesso!!!";
            
        }catch(Exception ex){
            
            resp = "Erro " + ex.getMessage();
        
        }
        return resp;
    }
    public String inserirSangria(Sangria sangi){
        String resp;
        try{
            Connection con = Conecta.getConexao(); // método que faz a conexão 
            String sql = "INSERT INTO sangria (Valor, Data, Operacao_caixa_idOperacao_caixa) VALUES (?, curdate(), '1');";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, sangi.getValor());

            ps.execute(); 
            ps.close(); 
            con.close(); 
            
            resp = "Dados salvos com sucesso!!!";
            
        }catch(Exception ex){
            
            resp = "Erro " + ex.getMessage();
        
        }
        return resp;
    }
    public String inserirSubcategoria(SubCategorizacao subcatego){
        String resp;
        try{
            Connection con = Conecta.getConexao(); // método que faz a conexão 
            String sql = "INSERT INTO sub_categorizacao (Descricao, Categorizacao_idCategorizacao) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, subcatego.getDescricao());
            ps.setInt(2, subcatego.getCategorizacao_idCategorizacao());

            ps.execute(); 
            ps.close(); 
            con.close(); 
            
            resp = "Dados salvos com sucesso!!!";
            
        }catch(Exception ex){
            
            resp = "Erro " + ex.getMessage();
        
        }
        return resp;
    }
    public String inserirSuprimento(Suprimento supri){
        String resp;
        try{
            Connection con = Conecta.getConexao(); // método que faz a conexão 
            String sql = "INSERT INTO suprimento (Valor, Data, Operacao_caixa_idOperacao_caixa) VALUES (?, CURDATE(), '1')";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, supri.getValor());

            ps.execute(); 
            ps.close(); 
            con.close(); 
            
            resp = "Dados salvos com sucesso!!!";
            
        }catch(Exception ex){
            
            resp = "Erro " + ex.getMessage();
        
        }
        return resp;
    }
    
    public String inserirDevolucao(Devolucao devolu){
        String resp;
        try{
            Connection con = Conecta.getConexao(); // método que faz a conexão 
            
                //;

            String sql = "INSERT INTO `caixa`.`devolucao` (`Data`, `Valor devolvido`, `Nota de devolucao`, `Operacao_caixa_idOperacao_caixa`) VALUES (CURDATE(), ?, ?, '1')";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, devolu.getValorDevolvido());
            ps.setInt(2, devolu.getNotaDevolucao());
            
            ps.execute(); 
            ps.close(); 
            con.close(); 
            
            resp = "Dados salvos com sucesso!!!";
            
        }catch(Exception ex){
            
            resp = "Erro " + ex.getMessage();
        
        }
        return resp;
    }
    
}
