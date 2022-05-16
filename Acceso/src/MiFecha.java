/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6
 */
import java.util.Scanner;
public class MiFecha {
    private int dia;
    private int mes;
    private int anio;
    
    public MiFecha(){
        
    }

    public MiFecha(int dia, int mes, int anio) {
                if(dia >= 1 && dia < 32){
            this.dia = dia;
        }else{
            System.out.println("DIA INCORRECTO/NO ASIGNADO");
        }
                        if(mes >=1 && mes <=12){
            this.mes = mes;
        }else{
            System.out.println("MES INCORRECTO/NO ASIGNADO");
        }
                if(anio >= 0 && anio <=2022){
            this.anio = anio;
        }else{
            System.out.println("AÑO INCORRECTO/NO ASIGNADO");
        }
       
    }
    
    
    
    

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia >= 1 && dia < 32){
            this.dia = dia;
        }else{
            System.out.println("DIA INCORRECTO/NO ASIGNADO");
        }
        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes >=1 && mes <=12){
            this.mes = mes;
        }else{
            System.out.println("MES INCORRECTO/NO ASIGNADO");
        }
        
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if(anio >= 0 && anio <=2022){
            this.anio = anio;
        }else{
            System.out.println("AÑO INCORRECTO/NO ASIGNADO");
        }
        
    }
    
    public void getMiFecha(){
        System.out.println("Fecha: "+getDia()+"/"+getMes()+"/"+getAnio());
    }
    
    public void pedirMiFecha(){
         Scanner sc = new Scanner(System.in);
                System.out.println("Inserta el dia: ");
        setDia(sc.nextInt());
        System.out.println("Inserta el mes: ");
        setMes(sc.nextInt());
        System.out.println("Inserta el anio: ");
        setAnio(sc.nextInt());
    }
    
}
