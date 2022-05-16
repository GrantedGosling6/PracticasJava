/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6
 */
public class ProbarCuenta {
    
    public static void main(String[] args) {
        
        Cuenta fernando = new Cuenta(1001,"Fernando Espinosa",20000,0.05);
        fernando.mostrarcuenta();
        fernando.Deposito(7000);
        fernando.mostrarSaldo();
        fernando.Retiro(3000);
    }
    
}
