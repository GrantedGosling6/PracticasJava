/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Ghumano extends Guerrero{
    
    public Ghumano(){
        raza="Humano";
        arma ="Espada";
        vitalidad = 20;
        fuerza =12;
        
    }
    


    public Ghumano(String arma) {
        super(arma);
    }
    
    public void lanzaAtaque(Personaje oponente ){
        
        
        System.out.println(nombre+"\n ***USA SU "+arma+"***\n");
        
        if(oponente instanceof Mago){
           double temp = oponente.getVitalidad()- (12*.60);
        oponente.setVitalidad(temp);
                 System.out.println(oponente.getNombre()+" SALUD RESTANTE: "+oponente.getVitalidad());
        
        

        }else if(oponente instanceof Gelfo ){
             oponente.setVitalidad(oponente.getVitalidad()- (12*.40));
             System.out.println(oponente.getNombre()+" SALUD RESTANTE: "+oponente.getVitalidad());
            
        }else if(oponente instanceof Ghumano){
             oponente.setVitalidad(oponente.getVitalidad()- (12*.30));
             System.out.println(oponente.getNombre()+" SALUD RESTANTE: "+oponente.getVitalidad());
        }
        

        
    }
   
}
