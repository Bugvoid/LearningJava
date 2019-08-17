
package filapilha;

/**
 *
 * @author Hilton Lucas Fernandes Souza - RGM 17464315
 */
public class FilaPilha <E>{

    private Node inicio;
    private Node fim;
    private int qtdElementos;
    private int topo;
    private int vet[];
    
    public FilaPilha (){
    inicio = null;
    fim = null;
    qtdElementos = 0;
    vet = new int[10];
    topo = -1;    
}
    
    
    public void push(int dado) {
       
            topo++;
            vet[topo] = dado;
        
    }

    public int pop() {
        int resp=0;
        
            resp = vet[topo];
            topo--;
        
        return resp;
    }
    
        public void Enfileirar(E dadoParametro){
        Node novaCaixa = new Node();
        novaCaixa.setValue(dadoParametro);
        
        if(qtdElementos == 0){
            inicio = novaCaixa;
            fim = novaCaixa;
            qtdElementos++;
        }
        else{
            fim.setNext(novaCaixa);
            fim = fim.getNext();
            qtdElementos++;
        }
    }
    
    public E Desenfileirar(){
        E ret = null;
            if(qtdElementos == 0){
                System.out.println("Fila Vazia!");
            }
            else{                
                ret = (E) inicio.getValue();
                Node aux = inicio;
                inicio = inicio.getNext();
                aux = null;
                qtdElementos--;
            }        
     return ret;
    }    
    public static void main(String[] args) {
        FilaPilha <Integer> fila = new FilaPilha();
        FilaPilha pilha = new FilaPilha();
        
         
        fila.Enfileirar(1);
        fila.Enfileirar(2);
        fila.Enfileirar(3);
        fila.Enfileirar(4);
        fila.Enfileirar(5);
        
        pilha.push(fila.Desenfileirar());
        pilha.push(fila.Desenfileirar());
        pilha.push(fila.Desenfileirar());
        pilha.push(fila.Desenfileirar());
        pilha.push(fila.Desenfileirar());
        
        fila.Enfileirar(pilha.pop());
        fila.Enfileirar(pilha.pop());
        fila.Enfileirar(pilha.pop());
        fila.Enfileirar(pilha.pop());
        fila.Enfileirar(pilha.pop());
        
        
        System.out.println(fila.Desenfileirar());
        System.out.println(fila.Desenfileirar());
        System.out.println(fila.Desenfileirar());
        System.out.println(fila.Desenfileirar());
        System.out.println(fila.Desenfileirar());
        
    }
    
}
