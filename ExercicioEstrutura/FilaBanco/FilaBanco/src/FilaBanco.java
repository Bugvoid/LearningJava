public class FilaBanco <E>{
    private Node inicio;
    private Node fim;
    private Node pc;
    private int qtdElementos;
   Pessoa p = new Pessoa();
    public FilaBanco(){
        inicio       = null;
        fim          = null;
        pc           = null;
        qtdElementos = 0;
    
    }
    
    public void Senha(E senha){
        Node novaCaixa = new Node();
        novaCaixa.setValue(senha);
        
        if(qtdElementos == 0){
            inicio = novaCaixa;
            fim = novaCaixa;
            pc = novaCaixa;
            qtdElementos++;
        }
        else{
            fim.setNext(novaCaixa);
            fim = fim.getNext();
            qtdElementos++;
        }
        System.out.println(senha);
    }
    public void Senha_privata(E dado, int pos){
        if(pos < 0 || pos > qtdElementos){
              System.out.println("posicao invalida \n");
        }else{
                Node nova  = new Node();
                nova.setValue(dado);
        
                for(int i=0; i<pos-1;i++){
                        pc = pc.getNext();
                }
                
                nova.setNext(pc.getNext());
                pc.setNext(nova);
                qtdElementos++;
        }   
    }
    
    
    public E xau_2(){
        E ret = null;
            if(qtdElementos == 0){
                System.out.println("Fila Vazia!");
            }
            else{                
                ret = (E) inicio.getValue();
                Node aux = inicio;
                pc = pc.getNext();
                inicio = inicio.getNext();
                aux = null;
                qtdElementos--;
            }        
     return ret;
    }
     
    public void vazia(){
        if(qtdElementos == 0){
         System.out.println("Fila vazia \n");    
     }else{
            System.out.println("Não está Vazia");
    }
    }
   
    public void proximo(){
        if(qtdElementos == 0){
            System.out.print("Não tem Próximo \n");
        }else{
            System.out.println("Tem Próximo \n");
        }
    }
    /*public void cheia(){
        if(){
            System.out.println("fila cheia \n");
        }else{
            System.out.println("Não está Cheia");
        }
    }*/
}
