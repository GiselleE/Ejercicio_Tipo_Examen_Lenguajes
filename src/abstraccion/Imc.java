/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;


public class Imc {
     private float peso;
    private float altura;
    private float imc;
    public Imc(float altura, float peso){
        this.peso=peso;
        this.altura=altura;
    }
    public String calcula_imc(){
          imc=peso/(altura*altura);
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
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }
    
    
}
