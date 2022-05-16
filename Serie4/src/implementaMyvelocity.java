/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6
 */
public class implementaMyvelocity {
    public static void main(String[] args) {
        
            
       Myvelocity ayer = new Myvelocity(10.0,10.0);
        Myvelocity hoy = new Myvelocity();

        
        hoy.pedirMiVelocidad();
        hoy.getMiVelocidad();
        
        
        double promedio=(hoy.getMiVelocidad()+ayer.getMiVelocidad())/2;
        System.out.println("promedio: " +promedio);
   
        
    }
}
