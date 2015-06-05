package Arreglos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PEAGLE
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int x[]={1,45,-12,7};
    int y[]=new int [3];
    y[0]=34;
    y[1]=12;
    y[2]=45;
    
    int z[]=new int []{3,-12,9};
    String hola="hola malo reprobado";
    
   byte []algo=hola.getBytes();
   StringBuilder builder=new StringBuilder();
   for(byte valor:algo){
       builder.append((char)valor);
       
   
    }
    etiqueta.setText(builder.toString());
    }
    
}
