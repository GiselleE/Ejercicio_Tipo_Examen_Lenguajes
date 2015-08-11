/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTipoExamen;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Login extends Exception{
 
    String user;
    String password;
    
   public Login(String user, String password){
       this.user=user;
       this.password=password;
   }
    
   public boolean verificar() throws Exception{
       boolean resultado=false;
       if(user.equals("examen") &&password.equals("aprobado")){
           resultado=true;
          
       }else {
       resultado=false;
       throw new Exception("Reprobadisisisimo");
   }
        return resultado;
   }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
