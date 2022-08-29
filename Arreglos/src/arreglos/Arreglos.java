/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;
import java.lang.*;
/**
 *
 * @author Fernando
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String original[] = {"Esta es ", "la clase de ", "programacion ", "Orientada ", "a ", "objetos "};
         String copia[] = {"Debemos ", "hacer ", "una ", "copia ", "de ", "arreglos ", "en ", "nuestra ", "practica ", "de ", "lenguaje ", "Java ", "de ", "hoy "};
         
         for (int i = 0; i < copia.length; i++) {
             
             System.out.print(copia[i]);
            
        }
         
         System.out.println("-----------------------");
                  for (int j = 0; j < original.length; j++) {
             
             System.out.print(original[j]);
            
        }
                System.out.println("-----------------------");
        System.arraycopy(original, 2, copia,10, 4);
         
        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i]);
            
        }
        
        
    }
    
}
