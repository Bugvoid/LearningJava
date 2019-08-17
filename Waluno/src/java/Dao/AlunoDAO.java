
package Dao;

import Basic.Aluno;
//import com.mysql.cj.protocol.Resultset;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author Duilor
 */
public class AlunoDAO {
    public String inserirAluno(Aluno aluno){
        String resp;
        try{
            Connection con = Conecta.getConexao(); // método que faz a conexão 
            String sql = "INSERT INTO DADOS(RGM,NOME,NOTA1,NOTA2) VALUES(?,?,?,?)"; 
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, aluno.getRgm());
            ps.setString(2,aluno.getNome());
            ps.setFloat(3, aluno.getNota1());
            ps.setFloat(4, aluno.getNota2());
             
            
            
            ps.execute(); 
            ps.close(); 
            con.close(); 
            
            resp = "Dados salvos com sucesso!!!";
            
        }catch(Exception ex){
            
            resp = "Erro " + ex.getMessage();
        
        }
        return resp;
    }
    
    public ArrayList<Aluno> getAlunos(){
        ArrayList<Aluno> lista = new ArrayList<>();
        try{
            Connection con = Conecta.getConexao();
            String sql = "SELECT RGM,NOME,NOTA1,NOTA2 FROM DADOS";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Aluno aluno = new Aluno();
                aluno.setNome(rs.getString("nome"));
                aluno.setRgm(rs.getString("rgm"));
                aluno.setNota1(rs.getFloat("nota1"));
                aluno.setNota2(rs.getFloat("nota2"));
                lista.add(aluno);  
            }
        }catch(Exception ex){
            lista = null;
        }
        
        return lista;
    }
    
    public String alterarAluno(Aluno aluno){
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            String sql = "UPDATE DADOS SET NOME=?, NOTA1=?, NOTA2=? WHERE RGM=?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, aluno.getNome());
            ps.setFloat(2, aluno.getNota1());
            ps.setFloat(3, aluno.getNota2());
            ps.setString(4, aluno.getRgm());
            
            ps.execute();
            ps.close();
            con.close();
            resp = "Aluno Alterado com Sucesso!!!";
            
        }catch(Exception ex){
            resp = "Erro: " + ex.getMessage();
        }
        return resp;
    }
    
    public String excluirAluno(Aluno aluno){
        String resp = "";
        try{
            Connection con = Conecta.getConexao();
            String sql = "DELETE FROM DADOS WHERE RGM = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, aluno.getRgm());
            
            ps.execute();
            ps.close();
            con.close();
            resp = "Aluno Excluído com Sucesso!!!";
            
        }catch(Exception ex){
            resp = "Erro: " + ex.getMessage();
        }
        return resp;
    }
    
    public Aluno selecionarAluno(String rgm){
        
        Aluno aluno = new Aluno();
        try{
            Connection con = Conecta.getConexao();
            String sql = "SELECT RGM, NOME, NOTA1, NOTA2 from dados WHERE RGM = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, rgm);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                aluno.setNome(rs.getString("nome"));
                aluno.setNota1(rs.getFloat("nota1"));
                aluno.setNota2(rs.getFloat("nota2"));
            }
            
        }catch(Exception ex){
            aluno = null;
        }
        
        return aluno;
    }
}