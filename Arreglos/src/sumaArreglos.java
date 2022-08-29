/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gusan
 */
public class sumaArreglos {
    
        public static void main(String[] args) {
        int arreglo[] = new int[] {12,34,45,21,33,4};
        int sum = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sum+=arreglo[i];
        }
        System.out.println("La suma de los números contenidos en el arreglo es= "+sum);
        
    }
}
