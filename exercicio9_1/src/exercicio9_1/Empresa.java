package exercicio9_1;


import exercicio9_1.Trabalhador;
import exercicio9_1.Veic;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luan.Castro
 */
public class Empresa {
    private String razaos,nomefan,CNPJ;
    private Trabalhador trab[];
    private Trabalhador diretor;
    private Trabalhador secretSindicato;
    private Veic veic[];
    private int qtdeVeic;
    private int qtdeTrab;

    public Empresa() {
    }

    public Empresa(String razaos, String nomefan, String CNPJ, Trabalhador[] trab, Trabalhador diretor, Trabalhador secretSindicato, Veic[] veic, int qtdeVeic, int qtdeTrab) {
        this.razaos = razaos;
        this.nomefan = nomefan;
        this.CNPJ = CNPJ;
        this.trab = trab;
        this.diretor = diretor;
        this.secretSindicato = secretSindicato;
        this.veic = veic;
        this.qtdeVeic = qtdeVeic;
        this.qtdeTrab = qtdeTrab;
    }

    public float mediaSalario(Empresa emp, int qtdeTrab){
        float media = 0;
        float soma = 0;
        int cont = 0;
        ////////Media 
        for(int i =0; i<this.qtdeTrab;i++){
            soma += emp.trab[i].getSalario();
            cont++;
        }

        media = (soma/cont);
        return media;
    
    
}
    public float Soma(Empresa emp,int qtdeVeic){
        
        float soma = 0;
        
        ////////Media 
        for(int i =0; i<this.qtdeTrab;i++){
            soma += emp.veic[i].getKm();
            
        }

        
        return soma;
    
    
}
        public void cadast(){
            Empresa emp = new Empresa();
            
           qtdeTrab = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Trabalhadores"));
           qtdeVeic = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Veiculos"));
        
        
        trab = new Trabalhador[qtdeTrab];
        veic = new Veic[qtdeVeic];
        
        
        for(int i =0; i<qtdeTrab;i++){
            trab[i] = new Trabalhador();
            trab[i].leituraAtribudos();
            
        }
        for(int i =0; i<qtdeVeic;i++){
            veic[i] = new Veic();
            veic[i].leituraAtribudos();
            
        }
        System.out.println("O media dos salarios" + emp.mediaSalario(emp, qtdeTrab));
         System.out.println("A quilometragem total dos veiculos" + emp.Soma(emp, qtdeVeic));
        }
}
