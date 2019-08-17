
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecta {
    
    public static Connection getConexao() throws Exception{
       Connection con = null;
       String serverName = "localhost:3306";
       String database = "alunos";
       
               
       String usuario = "root";
       String senha = "root";
       
       // tambem certo Class.forName("com.mysql.jdbc.Driver"); 
       String driverName = "com.mysql.cj.jdbc.Driver";
       Class.forName(driverName);   
       
       String url = "jdbc:mysql://" + serverName + "/" + database + "?useTimezone=true&serverTimezone=UTC"; // a JDBC url
        con = DriverManager.getConnection(url, usuario, senha);
       return con;
        
    }
    
}
