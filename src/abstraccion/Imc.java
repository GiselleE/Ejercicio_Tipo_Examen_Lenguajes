/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;


public class Imc {
     private float peso;
    private float altura;
    private boolean flaco;
    private float imc;

    Imc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setFlaco(boolean flaco){
        this.flaco=flaco;
    }
    public boolean isFlaco(){
        return flaco;
            
            }
            
            
    public Imc(float altura, float peso){
        this.peso=peso;
        this.altura=altura;
    }
    public String calcula_imc(){
           float imc=peso/(altura*altura);
        return "Tu imc " + imc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
         float imc = 0;
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
    
    
}
