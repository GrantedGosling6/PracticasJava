/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusan
 */
public class ArregloBidimensional {
    
    public static void main(String[] args) {
        int numeros [][] = new int [10][5];
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j]=i+j;
                
                
            }
            
        }
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("posicion["+i+"]["+j+"] es:"+numeros[i][j]+"      ");
                
            }
            System.out.println("");
        }
        System.out.println("-----------------------");
    }
    
}
