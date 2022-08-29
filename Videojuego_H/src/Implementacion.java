
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Implementacion {
    
    public static void main(String[] args) {
        
         int decision=0;
        
            int raza=0;
            int tipo=0;
            System.out.println("***CREA TUS 2 PERSONAJES***");
            
            System.out.println("***CREA EL PERSONAJE 1***");     
        System.out.println("[1]GUERRERO // [2]MAGO");
        Scanner input = new Scanner(System.in);
        tipo=input.nextInt();
        System.out.println("[1]HUMANO // [2]ELFO");
        raza=input.nextInt();
        Ghumano gh1 = new Ghumano();
        mHumano mh1 = new mHumano();
        Gelfo ge1 = new Gelfo();
        mElfo me1 = new mElfo();
        Ghumano gh2 = new Ghumano();
        mHumano mh2 = new mHumano();
        Gelfo ge2 = new Gelfo();
        mElfo me2 = new mElfo();
              
        char opc;
        
        if(raza==1 && tipo == 1){
            
            gh1.setNombre();
            gh1.mostrarPersonaje();
            gh1.mostrarVitalidad();
            opc ='a';
        }else if(raza==1 && tipo == 2){
             
             mh1.setNombre();
             mh1.mostrarPersonaje();
             mh1.mostrarVitalidad();
            opc ='b';
        }else if(raza==2 && tipo == 1){
            
            ge1.setNombre();
            ge1.mostrarPersonaje();
            ge1.mostrarVitalidad();
            opc='c';
                    
        }else if(raza==2 && tipo == 2){
            
            me1.setNombre();
            me1.mostrarPersonaje();
            me1.mostrarVitalidad();
            opc='d';
        }
            System.out.println("***CREA EL PERSONAJE 2***");
         System.out.println("[1]GUERRERO // [2]MAGO");     
        tipo=input.nextInt();
        System.out.println("[1]HUMANO // [2]ELFO");
        raza=input.nextInt();
        
                    
                  
   if(raza==1 && tipo == 1){
           
            gh2.setNombre();
            gh2.mostrarPersonaje();
            gh2.mostrarVitalidad();
        }else if(raza==1 && tipo == 2){
            
             mh2.setNombre();
             mh2.mostrarPersonaje();
             mh2.mostrarVitalidad();
            
        }else if(raza==2 && tipo == 1){
            
            ge2.setNombre();
            ge2.mostrarPersonaje();
            ge2.mostrarVitalidad();
                    
        }else if(raza==2 && tipo == 2){
           
            me2.setNombre();
            me2.mostrarPersonaje();
            me2.mostrarVitalidad();
            
        }
   
   do{
            
     if(gh1 instanceof Guerrero){
         System.out.println("QUE DESEAS HACER? [1] ATACAR // [2]DEFENDER");
        decision=input.nextInt();
        if(decision==1){
            gh1.lanzaAtaque(me2);
            
        }else if(decision==2){
            
        }
        
        
     } 
     if(me2.vitalidad >0 && me2 instanceof Mago){
         System.out.println("QUE DESEAS HACER? [1] ATACAR // [2]CURAR");
        decision=input.nextInt();
        if(decision==1){
            me2.lanzaAtaque(gh1);
            
        }else if(decision==2){
            me2.sanacion();
            
        }
         
     }else{
            System.out.println(me2.getNombre()+"***HA MUERTO***");
            System.out.println("GANADOR: "+gh1.getNombre());
     }
   }
   
   
     while(gh1.getVitalidad()>0 && me2.getVitalidad()>0);    
       
        if(gh1.getVitalidad()<=0){

        }else if(gh2.getVitalidad()<=0){
            
            System.out.println(gh2.getNombre()+"***HA MUERTO***");
            System.out.println("GANADOR: "+gh1.getNombre());
         

            
        }
         
     
     /*if(gh1 instanceof Guerrero){
         System.out.println("QUE DESEAS HACER? [1] ATACAR // [2]DEFENDER");
        decision=input.nextInt();
        if(decision==1){
            gh1.lanzaAtaque(gh2);
            
        }else if(decision==2){
            
        }
        
        
     } 
     if(me2 instanceof Mago){
         System.out.println("QUE DESEAS HACER? [1] ATACAR // [2]CURAR");
        decision=input.nextInt();
        if(decision==1){
            me2.lanzaAtaque(gh1);
            
        }else if(decision==2){
            me2.sanacion();
            
        }
         
     }
     }
     
        
   
   
   
   
   
        
        
        
        
 
                            //Ghumano per1 = new Ghumano();
                            //per1.setNombre();
                            //per1.setRaza();
                           // per1.setFuerza(12);
                            //per1.setVitalidad(20);
                            //per1.asignaArma();
                            //per1.mostrarPersonaje();
                           // per1.mostrarArma();
                           
                              
                            
                            
                            
                          //mHumano per2 = new mHumano();
                            //per2.setNombre();
                            //per2.setRaza();
                            //per2.setFuerza(50);
                           // per2.setVitalidad(130.8);
                           // per2.asignaPoder();
                           // per2.mostrarPersonaje();
                            //per2.mostrarPoder();
                            
                            
                            
                           /* per2.Ataque(per1);
                            per1.mostrarVitalidad();
                            per1.Ataque(per2);
                            per2.mostrarVitalidad();
                            per2.Ataque(per1);
                            per1.mostrarVitalidad();*/
                            
                            
                     
                            
                   
    }
//TERMINA MAI

       /* public static void creaPersonajes()
        {
            int raza=0;
            int tipo=0;
            System.out.println("***CREA TUS 2 PERSONAJES***");
            
            System.out.println("***CREA EL PERSONAJE 1***");     
        System.out.println("[1]GUERRERO // [2]MAGO");
        Scanner input = new Scanner(System.in);
        tipo=input.nextInt();
        System.out.println("[1]HUMANO // [2]ELFO");
        raza=input.nextInt();
        
                
        
        if(raza==1 && tipo == 1){
             Ghumano per1 = new Ghumano();
            per1.setNombre();
            per1.mostrarPersonaje();
            per1.mostrarVitalidad();
        }else if(raza==1 && tipo == 2){
             mHumano per1 = new mHumano();
             per1.setNombre();
             per1.mostrarPersonaje();
             per1.mostrarVitalidad();
            
        }else if(raza==2 && tipo == 1){
            Gelfo per1 = new Gelfo();
            per1.setNombre();
            per1.mostrarPersonaje();
            per1.mostrarVitalidad();
                    
        }else if(raza==2 && tipo == 2){
            mElfo per1 = new mElfo();
            per1.setNombre();
            per1.mostrarPersonaje();
            per1.mostrarVitalidad();
        }
            System.out.println("***CREA EL PERSONAJE 2***");
         System.out.println("[1]GUERRERO // [2]MAGO");     
        tipo=input.nextInt();
        System.out.println("[1]HUMANO // [2]ELFO");
        raza=input.nextInt();
        
                    
                  
   if(raza==1 && tipo == 1){
             Ghumano per2 = new Ghumano();
            per2.setNombre();
            per2.mostrarPersonaje();
            per2.mostrarVitalidad();
        }else if(raza==1 && tipo == 2){
             mHumano per2 = new mHumano();
             per2.setNombre();
             per2.mostrarPersonaje();
             per2.mostrarVitalidad();
            
        }else if(raza==2 && tipo == 1){
            Gelfo per2 = new Gelfo();
            per2.setNombre();
            per2.mostrarPersonaje();
            per2.mostrarVitalidad();
                    
        }else if(raza==2 && tipo == 2){
            mElfo per2 = new mElfo();
            per2.setNombre();
            per2.mostrarPersonaje();
            per2.mostrarVitalidad();
            
        }
   
   
   
   
   
   
        }*/


}//TERMINA CLASE IMPLEMENTACION
