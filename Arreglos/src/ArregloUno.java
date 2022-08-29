/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusan
 */
public class ArregloUno {
    
    public static void main(String[] args) {
        int numeros [] = new int[5];
       
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero["+(i+1)+"]es "+ numeros[i]);
        }
        System.out.println("----------------------------");
        

int j=13;
        for (int i=0; i < numeros.length; i++) {
            numeros[i]=j;
            j+=13;
        }
                for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero["+i+"]es "+ numeros[i]);
        }
        System.out.println("----------------------------");
        
   

    }
}
