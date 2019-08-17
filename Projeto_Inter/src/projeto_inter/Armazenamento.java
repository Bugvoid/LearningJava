/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_inter;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luan.Castro
 */
public class Armazenamento {
    
      public boolean salvar (String filename, ArrayList arrlist) {
 
 try{
    FileOutputStream fos = new FileOutputStream(filename);
    ObjectOutputStream out = new ObjectOutputStream(fos);
    for (int i=0; i<arrlist.size(); i++) {
    out.writeObject( arrlist.get(i) );
 }
 out.close();
 fos.close();
 } catch(Exception ex){
 JOptionPane.showMessageDialog(null, "Erro salvando objetos... "
+ ex.getMessage());
 return false; 
 }
 return true; 
} 
    public boolean carregar (String filename, ArrayList arrlist) {
 //Este método carrega os objetos serializados gravados em 'filename' no vetor arrlist.
 FileInputStream fis;
 ObjectInputStream in;
 try {
 fis = new FileInputStream(filename);
 in = new ObjectInputStream(fis);
 arrlist.clear(); // esvaziamos o ArrayList
 boolean sair = false;
 do {
 try {
Object info = in.readObject(); // lê um objeto do arquivo
 arrlist.add(info); // adiciona na lista o objeto lido
 }
 catch (EOFException normalEof) { // EOF (end of file), é uma situação normal => acabaram os objetos
 sair=true;
 }
 } while (!sair);
 in.close(); fis.close();
 } catch(Exception e){
 JOptionPane.showMessageDialog(null, "Erro carregando objetos... " + e.getMessage());
 return false;
 }
 return true;
} 
}
