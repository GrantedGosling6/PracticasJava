
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6
 */
public class Myvelocity {
        private double distancia=10.0;
    private double tiempo=10.0;
    
    
    
    public Myvelocity(){
 
        
    }

    public Myvelocity(double distancia, double tiempo) {
    
       
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    
    
    
    
    

    
    
    public double getMiVelocidad(){
        double resultado=(distancia/tiempo);
        System.out.println("Datos: "+resultado);
        return resultado;
       
          
    }
    

    public void pedirMiVelocidad(){
        //double resultado;
       
         Scanner sc = new Scanner(System.in);
                System.out.println("Inserta la ditancia: ");
        setDistancia(sc.nextDouble());
        System.out.println("Inserta el tiempo: ");
        setTiempo(sc.nextDouble());
        // resultado=(distancia/tiempo);
        // System.out.println("Tu resultado es: "+resultado);
         
        
   

    }
}
