/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class mElfo extends Mago{

    public mElfo() {
        raza="Elfo";
        poder="Bola de fuego";
        vitalidad=30;
        fuerza=6;
    }

    public mElfo(String poder) {
        super(poder);
    }
    
    public void sanacion(){
        setVitalidad(getVitalidad()+4);
        System.out.println(nombre+" USO SANACION: ");
        System.out.println("SALUD: "+getVitalidad());
        
    }
    
    public void lanzaAtaque(Personaje oponente ){
        
        
        System.out.println(nombre+"\n ***USA SU "+poder+"***\n");
        
        if(oponente instanceof Guerrero){
           double temp = oponente.getVitalidad()- (6*.80);
        oponente.setVitalidad(temp);
         System.out.println(oponente.getNombre()+" SALUD RESTANTE: "+oponente.getVitalidad());
        
        

        }else if(oponente instanceof mHumano ){
             oponente.setVitalidad(oponente.getVitalidad()- (6*.50));
              System.out.println(oponente.getNombre()+" SALUD RESTANTE: "+oponente.getVitalidad());
            
        }else if(oponente instanceof mElfo){
             oponente.setVitalidad(oponente.getVitalidad()- (6*.70));
              System.out.println(oponente.getNombre()+" SALUD RESTANTE: "+oponente.getVitalidad());
        }
        

        
    }
    
}
