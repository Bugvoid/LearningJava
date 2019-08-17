package Classes;

public class Devolucao {
    private int IdDevolucao;
    private String data;
    private float valorDevolvido;
    private int notaDevolucao;

    public Devolucao() {
    }

    public Devolucao(int IdDevolucao, String data, float valorDevolvido, int notaDevolucao) {
        this.IdDevolucao = IdDevolucao;
        this.data = data;
        this.valorDevolvido = valorDevolvido;
        this.notaDevolucao = notaDevolucao;
    }

    public int getIdDevolucao() {
        return IdDevolucao;
    }

    public void setIdDevolucao(int IdDevolucao) {
        this.IdDevolucao = IdDevolucao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorDevolvido() {
        return valorDevolvido;
    }

    public void setValorDevolvido(float valorDevolvido) {
        this.valorDevolvido = valorDevolvido;
    }

    public int getNotaDevolucao() {
        return notaDevolucao;
    }

    public void setNotaDevolucao(int notaDevolucao) {
        this.notaDevolucao = notaDevolucao;
    }
    
}
