package dao;

import classes.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AlunoDAO {

   /**
     * Grava um aluno no banco de dados
     *
     * @param aluno
     * @return OK para sucesso ou mensagem de erro
     */
    public String gravarAluno(Aluno aluno) {
       
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "ss";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getRGM());
            ps.setString(2, aluno.getNome());
            ps.setFloat(3, aluno.getNota1());
            ps.setFloat(4, aluno.getNota2());
            
            ps.execute();
            
            ps.close();
            con.close();
            
            resp = "Aluno Cadastrado!";
        } catch (Exception e) {
            System.out.println(e);;
        }
        return resp;
     
    }

    /**
     * Pesquisa um aluno pelo RGM
     *
     * @param rgm RGM a ser pesquisado
     * @return
     */
    public Aluno getAluno(String rgm) {

        Aluno aluno = new Aluno();
        
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT * FROM dados WHERE rgm=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,rgm);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                aluno.setNome(rs.getString("nome"));
                aluno.setRGM(rs.getString("rgm"));
                aluno.setNota1(rs.getFloat("nota1"));
                aluno.setNota2(rs.getFloat("nota2"));
            } else {
                aluno = null;
            }
            
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            aluno = null;
        }
        
        return aluno;
    }
    
    public String gravarMedia(float media, String rgm) {
       
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "UPDATE dados SET media = ? WHERE rgm = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setFloat(1, media);
            ps.setString(2, rgm);
            
            ps.execute();
            
            ps.close();
            con.close();
            
            resp = "Média "+media+" atualizada com sucesso!";
        } catch (Exception e) {
            resp = "Erro!";
        }
        return resp;
     
    }
    
}