package Classes;
public class Mensagem {
    
    private String cor,msg,tooltip;
    private int tamanho;
    
    public String getCor(){
        return cor;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
}
