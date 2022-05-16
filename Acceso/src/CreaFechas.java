/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6
 */

public class CreaFechas {
    public static void main(String[] args) {
       
        MiFecha hoy = new MiFecha();

        
        MiFecha ayer = new MiFecha(28,4,2022);
        
        hoy.pedirMiFecha();
        
        hoy.getMiFecha();
        ayer.getMiFecha();
        
    }
   
}
