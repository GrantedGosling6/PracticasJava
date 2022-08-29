/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class mHumano extends Mago{

    public mHumano() {
        raza="Humano";
        poder="rayo";
        vitalidad=25;
        fuerza=8;
    }

    public mHumano(String poder) {
        super(poder);
    }
    
    public void sanacion(){
        setVitalidad(getVitalidad()+4);
        System.out.println(nombre+" USO SANACION: ");
        
    }
    
    public void Ataque(Personaje oponente){
        
        System.out.println(nombre+"\n ***Hechizo Lanzado***\n");
        oponente.setVitalidad(oponente.getVitalidad()- 8);
        
        if(oponente.getVitalidad()<=50){
           System.out.println(oponente.getNombre()+"*** HA MUERTO ***");
           System.out.println("GANADOR: " + nombre);
           System.exit(0);
          
       }
        
    }
    
}
