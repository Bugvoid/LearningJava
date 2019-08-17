
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
public class Projeto_Inter {
    
     
    
    
    
    public static void main(String[] args) {
        ArrayList list_2gra = new ArrayList();
        ArrayList list_Cone = new ArrayList();
        ArrayList list_Para = new ArrayList();
        ArrayList list_Tri =  new ArrayList();
        ArrayList list_Pont = new ArrayList();
        ArrayList list_Cili = new ArrayList();
        Armazenamento dados = new Armazenamento();
        
        int op = 0;
        
        do {                
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja fazer:"
                + "\n1 = equação do 2º grau"
                + "\n2 = Cone"
                + "\n3 = Paralelepipedo"
                + "\n4 = Triângulo"
                + "\n5 = Distancia entre dois pontos"
                + "\n6 = Cilindro"
                + "\n7 = Resultados Anteriores"
                + "\n0 = SAIR"));
            if(op ==1 || op==2 || op==3 || op==4 || op==4 || op==5 || op==6 || op==7 || op==0){
            switch(op){
            
                case 1:
                    
                    do{
                    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a"));
                    int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b"));
                    int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c"));
                    
                    Grau_2 grau = new Grau_2(a,b,c);
                    list_2gra.add(grau.toString());
                    dados.salvar("C:/temp/2_grau.dat", list_2gra);
                    JOptionPane.showMessageDialog(null,grau.toString());
                   
                    op = Integer.parseInt(JOptionPane.showInputDialog("Deseja calcular novamente?"+
                            "\n 1 - Sim \n 0 - Não"));
                    }while(op == 1);
                    
                    
                    break;
                case 2:
                    do{
                    float raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio do cone"));
                    float geratiz = Float.parseFloat(JOptionPane.showInputDialog("Digite a Geratriz do cone"));
                    Cone cone = new Cone(raio,geratiz);
                    JOptionPane.showMessageDialog(null,cone.toString());
                    list_Cone.add(cone.toString());
                    dados.salvar("C:/temp/Cone.dat", list_Cone);
                    op = Integer.parseInt(JOptionPane.showInputDialog("Deseja calcular novamente?"+
                            "\n 1 - Sim \n 0 - Não"));
                    }while(op == 1);
                    break;
                case 3:
                    do{
                    float larg = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da largura"));
                    float altu = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));
                    float compri = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do comprimento"));
                    paralelepipedo paralele = new paralelepipedo(larg, altu, compri);
                    JOptionPane.showMessageDialog(null,paralele.toString());
                    list_Para.add(paralele.toString());
                    dados.salvar("C:/temp/Parale.dat", list_Para);
                    
                    op = Integer.parseInt(JOptionPane.showInputDialog("Deseja calcular novamente?"+
                            "\n 1 - Sim \n 0 - Não"));
                    }while(op == 1);
                    break;
                case 4:
                    do{
                    float base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Base"));
                    float ladoa = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado A"));
                    float ladob = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado B"));
                    Triangulo tri = new Triangulo(base, ladoa, ladob);
                    JOptionPane.showMessageDialog(null,tri.toString());
                    list_Tri.add(tri.toString());
                    dados.salvar("C:/temp/Tri.dat", list_Tri);
                    
                    op = Integer.parseInt(JOptionPane.showInputDialog("Deseja calcular novamente?"+
                            "\n 1 - Sim \n 0 - Não"));
                    }while(op == 1);
                    break;
                    
                case 5:
                    do{
                    float xa = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor X da posição A"));
                    float ya = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor Y da posição A"));
                    float xb = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor X da posição B"));
                    float yb = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor Y da posição B"));
                    Ponto pont = new Ponto(xa, ya, xb, yb);
                    JOptionPane.showMessageDialog(null,pont.toString());
                    list_Pont.add(pont.toString());
                    dados.salvar("C:/temp/Ponto.dat", list_Pont);
                    
                    op = Integer.parseInt(JOptionPane.showInputDialog("Deseja calcular novamente?"+
                            "\n 1 - Sim \n 0 - Não"));
                    }while(op == 1);
                    break;
                case 6:
                    do{
                    float ra = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio do cilindro"));
                    float alt = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do cilindro"));
                    Cilindro cili = new Cilindro(ra, alt);
                    JOptionPane.showMessageDialog(null,cili.toString());
                    list_Cili.add(cili.toString());
                    dados.salvar("C:/temp/Cili.dat", list_Cili);
                    
                    op = Integer.parseInt(JOptionPane.showInputDialog("Deseja calcular novamente?"+
                            "\n 1 - Sim \n 0 - Não"));
                    }while(op == 1);
                    break;
                    
                case 7:
                    do{
                        String result ="";
                        int res = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite qual resultado deseja verificar:"
                              + "\n1 = equação do 2º grau"
                +               "\n2 = Cone"
                +               "\n3 = Paralelepipedo"
                +               "\n4 = Triângulo"
                +               "\n5 = Distancia entre dois pontos"
                +               "\n6 = Cilindro"
                
                ));
                switch (res) {
                    case 1:
                        dados.carregar("C:/temp/2_grau.dat", list_2gra);
                        for(int i = 0;i<list_2gra.size();i++){
                            result += list_2gra.get(i).toString() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, result);
                        break;
                    case 2:
                        dados.carregar("C:/temp/Cone.dat", list_Cone);
                        for(int i = 0;i<list_Cone.size();i++){
                            result += list_Cone.get(i).toString() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, result);
                        break;
                    case 3:
                        dados.carregar("C:/temp/Parale.dat", list_Para);
                        for(int i = 0;i<list_Para.size();i++){
                            result += list_Para.get(i).toString() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, result);
                        break;
                    case 4:
                        dados.carregar("C:/temp/Tri.dat", list_Tri);
                        for(int i = 0;i<list_Tri.size();i++){
                            result += list_Tri.get(i).toString() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, result);
                        break;
                    case 5:
                        dados.carregar("C:/temp/Ponto.dat", list_Pont);
                        for(int i = 0;i<list_Pont.size();i++){
                            result += list_Pont.get(i).toString() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, result);
                        break;
                    case 6:
                        dados.carregar("C:/temp/Cili.dat", list_Cili);
                        for(int i = 0;i<list_Cili.size();i++){
                            result += "\n" +list_Cili.get(i).toString() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, result);
                        break;
                    
                }
                    op = Integer.parseInt(JOptionPane.showInputDialog("Deseja verificar novamente?"+
                            "\n 1 - Sim \n 0 - Não"));
                    }while(op == 1);
                    break;
                case 0:
                    op = 1;
            
            
        }
            
        }else
            JOptionPane.showMessageDialog(null, "Opção invalida");
        
            } while (op == 0);
    }
  
}
