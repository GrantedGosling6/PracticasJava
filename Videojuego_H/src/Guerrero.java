/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
import java.util.*;
public class Guerrero extends Personaje{
    String arma;
    
    public Guerrero(){
        
    }

    public Guerrero(String arma) {
        this.arma = arma;
    }


 
    public String asignaArma(){
        Scanner input = new Scanner(System.in);
        System.out.println("ASIGNA UN ARMA: ");
        arma=input.nextLine();
        return arma;
    }
    public String mostrarArma(){
        System.out.println("ARMA EQUIPADA: "+arma);
        return arma;
    }
    
}
