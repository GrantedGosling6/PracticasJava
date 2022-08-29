
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Personaje {
    String nombre;
    String raza;
    int fuerza;
    double vitalidad;
    
    public Personaje(){}

    public void setNombre() {
        Scanner input = new Scanner(System.in);
        System.out.println("ASIGNA NOMBRE A TU PERSONAJE: ");
        nombre=input.nextLine();
        System.out.println("------------------------------------------");
        
    }

    public void setRaza() {
        Scanner input = new Scanner(System.in);
        System.out.println("ASIGNA RAZA: ");
        raza=input.nextLine();
        System.out.println("------------------------------------------");
    }

    public void setFuerza(int fuerza) {
        
        this.fuerza = fuerza;
    }

    public void setVitalidad(double vitalidad) {
        this.vitalidad = vitalidad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public double getVitalidad() {
        return vitalidad;
    }
    
    
    public void mostrarPersonaje(){
        System.out.println("Nombre: "+getNombre() + "\n Raza:  " + getRaza()+ "\n Fuerza: "+getFuerza());
        System.out.println("Vitalidad: "+getVitalidad());
        
    }
    
        public void mostrarVitalidad(){
        
        System.out.println(nombre+" Vitalidad: "+getVitalidad());
        
    }
        
        public void verificarOponentes(Personaje oponente){
                    
                       if(oponente.getVitalidad()<=0){
           System.out.println(oponente.getNombre()+"*** HA MUERTO ***");
                   System.out.println("GANADOR: " + nombre);
                   System.exit(0);
          
       }
        }
    
    
        
   
    
}
