
package listasequencial;


public class ListaSequencial {

    private int vet[];
    private int ult;
    private int pc;
    private int qtdElementos;
    private int n;
    
    public ListaSequencial(){
       n = 10;
       vet = new int[n];
       ult = pc = -1;
       qtdElementos = 0;
    }
    
    public void insere(int dadoParametro){
          if(qtdElementos == n){
              System.out.println("lista cheia \n");
          }else{
            ult++;
            vet[ult] = dadoParametro;
            qtdElementos++;
          }
    }
    
    public void insere_pos(int dadoParametro, int pos){
    
          if(qtdElementos == n){
              System.out.println("lista cheia \n");
          }else{
                  if(pos < 0 || pos > ult){
                      System.out.println("posicao invalida \n");                  
                  }
                  else{
                          for(int i = ult;i>= pos; i--){
                                vet[i+1] = vet[i];
                          }
                          vet[pos] = dadoParametro;
                          ult++;
                          qtdElementos++;
                        }
                }
    }

    public int remove_pos(int pos){
        int ret = -1;
        if(qtdElementos == 0){
              System.out.println("lista vazia \n");
          }else{
                  if(pos < 0 || pos > ult){
                      System.out.println("posicao invalida \n");                  
                  }else{
                         ret = vet[pos];
                         for(int i = ult; i>=pos; i--){
                                vet[i] = vet[i+1];
                         }
                         ult--;
                         qtdElementos--;
                  }
        }
       return ret;
    }
    
    public int pesquisa_elemento(int elemento){
    
        for(int i = 0; i<= ult; i++){
             if(vet[i] == elemento ){
                 return i;
             }
        }
         return -1;
    }
    
    public void remove_elemento(int elemento){
        int p;
        if(qtdElementos == 0){
              System.out.println("lista vazia \n");
        }else{
               for(p=0; p<=ult; p++){
                     if(vet[p] == elemento){
                          break;
                     }
               }
               if(p>ult){
                    System.out.println("Elemento nao encontrado \n");
               }
               else{
                       for(int i=p; i<=ult;i++){
                             vet[i] = vet[i+1];
                       }
                       ult--;
                       qtdElementos--;
               }
        }
    }
    
    public int elemento(int pos){
        return vet[pos];
    }
    
    public int tamanho(){        
        return qtdElementos;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        ListaSequencial lista = new ListaSequencial();
        
        lista.insere(1);
        lista.insere(0);
        lista.insere(3);
        lista.insere(4);
        lista.insere(5);
        lista.insere(6);
        lista.insere(7);
        
        int posicao = 2;
        int elementoNaPosicao = lista.elemento(posicao);
        
        System.out.println("O elemento na posição [" + posicao + "] é " + elementoNaPosicao + ".");
        System.out.println("O tamanho da lista é " + lista.tamanho() + ".");
        
    }
    
}
