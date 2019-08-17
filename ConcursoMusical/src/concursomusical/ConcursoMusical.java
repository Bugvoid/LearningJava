/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concursomusical;

import java.util.ArrayList;

/**
 *
 * @author logonaf
 */
public class ConcursoMusical {

       
    public static void main(String[] args) {
        Concurso c = new Concurso();
        String filename ="";
        String filename2 ="";
       c.salvarC(filename);
       c.carregarC(filename);
       c.salvarJ(filename);
       c.carregarJ(filename);
        
    }
    
}
