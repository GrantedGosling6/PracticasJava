/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Gelfo extends Guerrero{
  
  

    public Gelfo() {
        vitalidad=30;
        fuerza=8;
        arma="Ballesta";
        raza="Elfo";
    }

    public Gelfo(String arma) {
        super(arma);
    }
    
    public void Ataque(Personaje oponente){
        
        System.out.println(nombre+"\n ***USA SU "+arma+"***\n");
        
        if(oponente instanceof mHumano){
        oponente.setVitalidad(oponente.getVitalidad()- (8*.50));
        
        

        }else if(oponente instanceof Gelfo ){
             oponente.setVitalidad(oponente.getVitalidad()- (12*.40));
            
        }else if(oponente instanceof Ghumano){
             oponente.setVitalidad(oponente.getVitalidad()- (12*.30));
        }
        
    }
    
    
    
}
