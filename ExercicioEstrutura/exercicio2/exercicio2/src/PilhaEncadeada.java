


import javax.swing.JOptionPane;

/**
 * @author Cleber
 */
public class PilhaEncadeada <E>{

    private Node topo;
    private int nElementos;
	
    public PilhaEncadeada() {      
            topo       = null;
            nElementos = 0;
    }
   
    public void push(E dado) {      
        Node novo = new Node(); 
     
        novo.setValue(dado); 
        novo.setNext(null); 
        
        novo.setNext(topo);
        topo = novo;
        nElementos++;
    }
        
    public E pop(){
        
        E ret = (E) "";
        
       if(nElementos == 0){
            JOptionPane.showMessageDialog(null,"Não há elementos na pilha");
       }
       else{
             ret = (E) topo.getValue(); 
             Node aux = topo;
             topo = topo.getNext();
             aux = null;  //free memory
             nElementos--;
       }  
             return ret;
    }    
    
    public static void main(String[] args) {
            PilhaEncadeada<Integer> pilhae = new PilhaEncadeada<>();
        int cont = 2;
        do {            
            String dado = JOptionPane.showInputDialog(null,"Entre com o dado: ");
     
          if(dado.equalsIgnoreCase("+")){
            int num1 =  pilhae.pop();
            int num2 =  pilhae.pop();
            int resultado = num1 + num2;     
                         
              pilhae.push(resultado);              
              System.out.println("O resultado: "+ resultado);
              cont =  Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja parar?\n 1 - Sim  2- Não"));
          }
          else if(dado.equalsIgnoreCase("*")){
            int num1 =  pilhae.pop();
            int num2 =  pilhae.pop();
            int resultado = num1 * num2;     
                         
              pilhae.push(resultado);
              System.out.println("O resultado: "+ resultado);
              cont =  Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja parar?\n 1 - Sim  2- Não"));
          }
          
          else if(dado.equalsIgnoreCase("-")){
            int num1 =  pilhae.pop();
            int num2 =  pilhae.pop();
            int resultado = num1 - num2;     
                         
              pilhae.push(resultado);
              System.out.println("O resultado: "+ resultado);
              cont =  Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja parar?\n 1 - Sim  2- Não"));
          }
          
          else if(dado.equalsIgnoreCase("/")){
            int num1 =  pilhae.pop();
            int num2 =  pilhae.pop();
            int resultado = num1 / num2;     
                         
              pilhae.push(resultado);
              System.out.println("O resultado: "+ resultado);
              cont =  Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja parar?\n 1 - Sim  2- Não"));
          }
          
          else{
                  int num = Integer.parseInt(dado); 
               
                  pilhae.push(num);

         }
            
           
        } while (cont == 2);
        
     
    }

}
