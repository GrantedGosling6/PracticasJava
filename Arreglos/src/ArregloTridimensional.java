/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusan
 */
public class ArregloTridimensional {
        
    public static void main(String[] args) {
        int numeros [][][] = new int [10][5][3];
        
        for (int i = 0; i < numeros.length; i++) {
            
            for (int j = 0; j < numeros[i].length; j++) {
                
                for (int k = 0; k < numeros[i][j].length; k++){
                    
                numeros[i][j][k]=i+j+k;
                
                }
            }
            
        }
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                for (int k = 0; k < numeros[i][j].length; k++){
                
                System.out.println("posicion["+i+"]["+j+"]["+k+"] es:"+numeros[i][j][k]+"      ");
                }
            }
            System.out.println("");
        }
        System.out.println("-----------------------");
    }
    
}
