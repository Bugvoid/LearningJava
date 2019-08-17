package dao;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class consultas {

    public static String secao = "", zona = "", num_incricao = "",idcandidato = "";

    public void pesquisaRegiao(JComboBox c) {
        try {
            Connection con = Conecta.getConexao();
            String sql = "select * from tb_regiao order by regiao";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                c.addItem(rs.getString("regiao"));
            }

        } catch (Exception e) {

        }
    }

    public void Resultado(JComboBox Regiao, JComboBox Estado, JComboBox cidade, JComboBox zona, JComboBox sessao, JComboBox cargo, String dado) {
        try {
            Connection con = Conecta.getConexao();
            String sql = "";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // c.addItem(rs.getString("regiao"));
            }

        } catch (Exception e) {

        }
    }

    public void pesquisaEstado(JComboBox c, String regiao) {
        try {
            Connection con = Conecta.getConexao();
            String sql = "SELECT estado FROM tb_estado e JOIN tb_regiao r ON e.id_regiao=r.id_regiao "
                    + "where r.regiao = ? order by estado";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, regiao);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                c.addItem(rs.getString("estado"));

            }

        } catch (Exception e) {

        }
    }
    
    public void pesquisaSessao(JComboBox jbox) {
        try {
            String cidade = "São Paulo";
            Connection con = Conecta.getConexao();
            String sql = "SELECT nr_zona FROM sys.tb_zona_eleitoral ze JOIN sys.tb_cidade c ON ze.id_cidade=c.id_cidade AND ze.id_estado=c.id_estado WHERE c.nome = ?";
                            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cidade);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                jbox.addItem(rs.getString("nr_zona"));

            }

        } catch (Exception e) {

        }
    }
public void pesquisaZona(JComboBox jbox) {
        try {
         String cidade = "São Paulo"; //teste de puxar cidade;
            Connection con = Conecta.getConexao();
            String sql = "SELECT nr_zona FROM sys.tb_zona_eleitoral ze LEFT JOIN sys.tb_cidade c ON ze.id_cidade=c.id_cidade AND ze.id_estado=c.id_estado WHERE c.nome = ?;";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cidade);
                
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                jbox.addItem(rs.getString("nr_zona"));

            }

        } catch (Exception e) {

        }
    }
    public boolean verificaTitu(String titu) {
        boolean b = false;

        try {
            Connection con = Conecta.getConexao();
            String sql = "select secao,zona from sys.tb_titulo_eleitor where num_inscricao = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, titu);

            ResultSet rs = ps.executeQuery();
            rs.next();

            if (rs.getString("secao").equalsIgnoreCase(secao) && rs.getString("zona").equalsIgnoreCase(zona)) {

                try {

                    String sql1 = "SELECT count(*) 'Total' FROM sys.tb_apuracao where num_iscricao = ?";
                    PreparedStatement ps1 = con.prepareStatement(sql1);
                    ps1.setString(1, titu);

                    ResultSet rs1 = ps1.executeQuery();
                    rs1.next();
                    if (rs1.getString("Total").equalsIgnoreCase("0")) {
                        b = true;
                        consultas.num_incricao = titu;
                    } else {
                        b = false;
                    }
                } catch (Exception e) {
                    b = false;
                }
               
            } else {
                b = false;
            }
        } catch (Exception e) {
            b = false;
        }
        return b;
    }

    public void verificaCandi(String numCand, JLabel nome, JLabel imagem, int cargo, JLabel partido) {
        String cargo1 = Integer.toString(cargo);
        try {
            Connection con = Conecta.getConexao();
            String sql = "select c.nome,c.id,numero,p.sigla,foto from sys.tb_candidato c join sys.tb_partido p on c.id_partido = p.id where numero = ? and id_cargo = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, numCand);
            ps.setString(2, cargo1);
            ResultSet rs = ps.executeQuery();
            rs.next();
            consultas.idcandidato = rs.getString("id");
            nome.setText(rs.getString("nome"));
            partido.setText(rs.getString("sigla"));
            String val = (rs.getString("foto"));
            try {
                ImageIcon icon = new ImageIcon(getClass().getResource("/imagem/" + val + ".jpg"));
                imagem.setIcon(icon);
                imagem.setSize(240, 240);
            } catch (Exception E) {
                imagem.setIcon(null);
            }

        } catch (Exception e) {
            nome.setText((""));

        }

    }
    
    public void voto(){
        try {
            Connection con = Conecta.getConexao();
            String sql = "insert into sys.tb_apuracao (id_candidato,num_iscricao) values (?,?) ";
                   
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, consultas.idcandidato);
            ps.setString(2, consultas.num_incricao);
            ResultSet rs = ps.executeQuery(sql);
           
            rs.next();
                     
        } catch (Exception e) {

        }
        
    }

   

    public boolean Mesario(String login, String senha) {
        boolean b = false;
        try {
            Connection con = Conecta.getConexao();
            String sql = "select * from sys.tb_mesario where nome = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, login);
            
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            if (rs.getString("nome").equalsIgnoreCase(login) && rs.getString("senha").equalsIgnoreCase(senha)) {
                b = true;
            } else {
                b = false;
            }
        } catch (Exception e) {
            b = false;
            System.out.println(e);
        }
        return b;
    }
    
    
    public void PopularJTable(JTable table) {
  
        //VAI NO JTABLE da VIEW, PROPRIEDADES, ADICIONA AS COLUNAS APENAS
        try
  {
      
   Connection con = Conecta.getConexao();
   String sql = ""; //SELECT
   PreparedStatement ps = con.prepareStatement(sql);
   ps.execute();
   ResultSet resultado = ps.executeQuery(sql);
   DefaultTableModel model =(DefaultTableModel) table.getModel(); //MODELOS MAIS SIMPLES
   model.setNumRows(0); //INICIO DAS LINHAS
   while(resultado.next())
   {
       model.addRow(new Object[] 
       { 
          //retorna os dados da tabela do BD, cada campo e um coluna.
          resultado.getString("id"),
          resultado.getString("cargo"),
          resultado.getString("zona"),
          resultado.getString("secao")
       }); 
  } 
   ps.close();
   con.close();
  }
 catch (SQLException ex)
 {
    System.out.println("o erro foi " +ex);
  }
 }
}
