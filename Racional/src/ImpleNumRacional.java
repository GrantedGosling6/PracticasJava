/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6
 */
public class ImpleNumRacional {
    
    public static void main(String[] args) {
        NumeroRacional r1 = new NumeroRacional(2,4);
        NumeroRacional r2 = new NumeroRacional(3,2);
        
        r1.Visualizarnum();
        r2.Visualizarnum();
        
        NumeroRacional resultado = new NumeroRacional();
        
        
       resultado=NumeroRacional.Sumarracional(r1, r2);
       resultado.Visualizarnum();
    }
    
}
