/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursomusical;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author logonaf
 */
public class Concurso {
    private String nomeConcur;
    private Candidato cand[];
    private Juri juri[];
    private int qtdec;
    private int qtdej;
    

    public Concurso() {
         qtdec = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de candidados"));
         qtdej = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Juri"));
        
          cand = new Candidato[qtdec];
          
          juri = new Juri[qtdej];
          for(int i =0; i<qtdec;i++){
            cand[i] = new Candidato();
            cand[i].leituraAtribudos();
            
            
        }
        for(int i =0; i<qtdej;i++){
            juri[i] = new Juri();
            juri[i].leituraAtribudos();
           
            
        }
        // Cand + juri no genero
        String po = JOptionPane.showInputDialog(null, "Digite um genero musical", JOptionPane.INFORMATION_MESSAGE);
        Candidato cat = null;
        Juri j = null;
        for(int i=0;i<qtdec+qtdej;i++){
            if(cand[i].getGemusic().equals(po)){
                cat =cand[i];
                System.out.println("O candidato que participa desse genero musical:" + cat.getNome());
            }if(juri[i].getGemusic().equals(po)){
                j = juri[i];
                System.out.println("O juri que participa desse genero musical:" + j.getNome());
            }//else System.out.println("Não existe esse genero");
        }
        //Cand com idades do sexo F
        
        for(int i=0;i<qtdec;i++){
            if(cand[i].getIdade() > 21 && cand[i].getIdade() < 25 && cand[i].getSexo().equals("F") || cand[i].getSexo().equals("f")){
                cat = cand[i];
                System.out.println("As candidatas com idade entre 21 e 25:" + cat.toString());
            }
            int qh = 0;
            for(i=0;i<qtdec;i++){
                if(cand[i].getSexo().equals("M") || cand[i].getSexo().equals("m")){
                    qh++;
                 }   
            }
            System.out.println("A quantidade de homens no concurso:" + qh);
        }
        
    }
      public boolean salvarC (String filename) {
 //Este método grava no arquivo filename o conteúdo de um vetor de objetos
 
    try{
            FileOutputStream fos = new FileOutputStream(filename);
//veja outros construtores, como: FileOutputStream(String name, boolean append)
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject( "" + qtdec); //gravamos o tamanho do vetor 
                for(int i=0; i<qtdec; i++) {
                        out.writeObject( cand[i] ); //gravamos o objeto i no arquivo
}
        out.close();
        fos.close();
 } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro salvando objetos... "
                                    + ex.getMessage());
    return false; //se deu algum erro, retornaremos false
 }
    return true; //deu tudo certo, retornaremos true
 }
      public boolean carregarC (String filename) {
 //Este método lerá todos os objetos serializados que existem
 //no arquivo filename e os carregará no vetor 
        FileInputStream fis;
        ObjectInputStream in;
 try{
        fis = new FileInputStream(filename);
        in = new ObjectInputStream(fis);
    cand = null;
 // lê a quantidade de objetos:
        qtdec = Integer.parseInt( (String) in.readObject() );
        cand = new Candidato[qtdec]; // alocamos memória para o vetor
 for (int i=0; i<qtdec; i++) { //ciclo para leitura dos objetos
        cand[i] = (Candidato) in.readObject(); // lê um objeto do arquivo e o guarda no vetor
 }
        in.close();
            fis.close();
 } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro carregando objetos... " + e.getMessage());
    return false;
    }
    return true;
 }
      public boolean salvarJ (String filename2) {
 //Este método grava no arquivo filename o conteúdo de um vetor de objetos
 
    try{
            FileOutputStream fos = new FileOutputStream(filename2);
//veja outros construtores, como: FileOutputStream(String name, boolean append)
            ObjectOutputStream out = new ObjectOutputStream(fos);
            out.writeObject( "" + qtdej); //gravamos o tamanho do vetor 
                for(int i=0; i<qtdej; i++) {
                        out.writeObject( juri[i] ); //gravamos o objeto i no arquivo
}
        out.close();
        fos.close();
 } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Erro salvando objetos... "
                                    + ex.getMessage());
    return false; //se deu algum erro, retornaremos false
 }
    return true; //deu tudo certo, retornaremos true
 }
      public boolean carregarJ (String filename2) {
 //Este método lerá todos os objetos serializados que existem
 //no arquivo filename e os carregará no vetor 
        FileInputStream fis;
        ObjectInputStream in;
 try{
        fis = new FileInputStream(filename2);
        in = new ObjectInputStream(fis);
    juri = null;
 // lê a quantidade de objetos:
        qtdej = Integer.parseInt( (String) in.readObject() );
        juri = new Juri[qtdej]; // alocamos memória para o vetor
 for (int i=0; i<qtdej; i++) { //ciclo para leitura dos objetos
        juri[i] = (Juri) in.readObject(); // lê um objeto do arquivo e o guarda no vetor
 }
        in.close();
            fis.close();
 } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro carregando objetos... " + e.getMessage());
    return false;
    }
    return true;
 }
}
