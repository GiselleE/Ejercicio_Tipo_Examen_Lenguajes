/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author T-107
 */
public class InterfazImc {
 public static void main(String []oso){
  Imc indice=new  Imc(1.68f,80);
  System.out.println("Tu IMC ES:"+indice.calcula_imc());
  
 /* System.out.println(indice.calcula_imc());
  
     if (indice.getImc() <20)
     {
         System.out.println("Tienes anorexia");
     } 
     else
     {
         if(indice.getImc()>=20 && indice.getImc() <25)
         {
             System.out.println("Estas en tu peso ideal");
         }else
         {
          if (indice.getImc()>=25 && indice.getImc() <30)  {
              System.out.println("Estas en supergorda");
          }
          else{
              System.out.println("Estas en plena obesidad");
          }
         }
     }
     
   */    
  
  //primitivos integrales 
byte b=2;
short s=2;
int i=2;
long l=2;
// ha esto lo llamamos como casting forzado
b=(byte)s;
s=b;
i=(int)l;
i=s;
s=(short)i;

float f=2.0f;
double d=2.0;

boolean boo=false;
Imc otro= new Imc();
System.out.println(otro.isFlaco());

 }
    
     
     
    
}





