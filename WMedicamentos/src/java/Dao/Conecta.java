package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecta {
    public static Connection getConexao() throws Exception {

        Connection con = null;
        //Configura servidor de Banco de Dados e nome do Banco
        String serverName = "localhost:3306";
        String mydatabase = "medicamentos";

        //Login e senha do banco
        String username = "root";
        String password = "root";
        
        //Carregando o JDBC Driver
        String driverName = "com.mysql.cj.jdbc.Driver";
        Class.forName(driverName);

        // Criando a conexÃ¯Â¿Â½o com o Banco de Dados
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true&serverTimezone=UTC"; // a JDBC url
        con = DriverManager.getConnection(url, username, password);

        return con;
    }
}
