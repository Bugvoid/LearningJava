/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Basic.Medicamentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author logonaf
 */
public class MedicamentoDao {
    public ArrayList<Medicamentos> getMedicamentos(String valor){
        ArrayList<Medicamentos> lista = new ArrayList<Medicamentos>();
        try{
            Connection con = Conecta.getConexao();
            String sql = "SELECT CODIGO, COMERCIAL, FARMACO, APRESENTACAO ";
            sql += " FROM MEDICAMENTOS where comercial like ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + valor + "%");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Medicamentos med = new Medicamentos();
                med.setCodigo(rs.getInt("codigo"));
                med.setComercial(rs.getString("comercial"));
                med.setFarmaco(rs.getString("farmaco"));
                med.setApresentacao(rs.getString("apresentacao"));
                lista.add(med);
            }
            rs.close();
            ps.close();
            con.close();
            
        }catch(Exception ex){
            lista = null;
        }
        return lista;
    }
}
