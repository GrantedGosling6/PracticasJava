
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Mago extends Personaje{
    String poder;
    
    public Mago(){
        
    }

    public Mago(String poder) {
        this.poder = poder;
    }


    public String asignaPoder(){
        Scanner input = new Scanner(System.in);
        System.out.println("ASIGNA UN ARMA: ");
        poder=input.nextLine();
        return poder;
    }
    
    public String mostrarPoder(){
        System.out.println("PODER: "+poder);
        return poder;
    }
    
    


    
}
