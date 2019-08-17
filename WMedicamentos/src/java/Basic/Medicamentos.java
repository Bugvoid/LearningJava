
package Basic;

public class Medicamentos {

    public Medicamentos() {
    }

    public Medicamentos(int codigo, String comercial, String farmaco, String apresentacao) {
        this.codigo = codigo;
        this.comercial = comercial;
        this.farmaco = farmaco;
        this.apresentacao = apresentacao;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the comercial
     */
    public String getComercial() {
        return comercial;
    }

    /**
     * @param comercial the comercial to set
     */
    public void setComercial(String comercial) {
        this.comercial = comercial;
    }

    /**
     * @return the farmaco
     */
    public String getFarmaco() {
        return farmaco;
    }

    /**
     * @param farmaco the farmaco to set
     */
    public void setFarmaco(String farmaco) {
        this.farmaco = farmaco;
    }

    /**
     * @return the apresentacao
     */
    public String getApresentacao() {
        return apresentacao;
    }

    /**
     * @param apresentacao the apresentacao to set
     */
    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }
    private int codigo;
    private String comercial;
    private String farmaco;
    private String apresentacao;
}
