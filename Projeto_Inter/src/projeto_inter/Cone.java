package projeto_inter;
//@author Thewarmachine13

import java.io.Serializable;

public class Cone  extends Ponto implements Serializable{
    private float raio,geratriz;
    public float getRaio() {
    return raio;}
    public void setRaio(float raio) {
    this.raio = raio;}
    public Cone() {}
    public Cone( float raio, float geratriz) {
    this.raio = raio;
    this.geratriz = geratriz;}
    
    public float AreaC(){   
    float at = (float) Math.round(Math.PI*raio * (geratriz+raio));
        return at;
    }
    public float Vou(){
        float alt = (float) Math.sqrt(Math.pow(raio, 2) + Math.pow(geratriz, 2));
                
        return (float) Math.round((Math.PI * Math.pow(raio, 2) * alt)/3);
    }
    public float getGeratriz() {
    return geratriz;}
    public void setGeratriz(float geratriz) {
    this.geratriz = geratriz;}
    @Override
    public String toString() {return "raio=" + raio + ",\n geratriz=" + geratriz + '}'+ "\n O volume do Cone: " + Vou()+ "\n e a Area total do Cone: "+AreaC();
    }}
