/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6 <https://github.com/GrantedGosling6>
 */
public class CreaEmpleado {
    
    public static void main(String[] args) {
        
        Empleado emple1 = new Empleado();
        Empleado emple2 = new Empleado("Fernando Espinosa", 2800.0);
        Empleado emple3 = new Empleado("Luis Angel", 2900.0, "20 de Febrero del 2000");
        
        emple1.mostrarDatos();
        emple2.mostrarDatos();
        emple3.mostrarDatos();
        
        Gerente gerent1 = new Gerente();
        Gerente gerent2 = new Gerente(true, "Sistemas", false, "Jhomar", 23000, "17 de diciembre 2000");
        Gerente gerent3 = new Gerente(false, "Sistemas", true, "Mauricio", 28000, "17 de diciembre 2000");
        
        gerent1.mostrarDatos();
        gerent2.mostrarDatos();
        gerent3.mostrarDatos();
        
        Ingeniero ing1 = new Ingeniero();
        Ingeniero ing2 = new Ingeniero("LAPTOP-HMCLSNDA", 3500.0, "Israel", 17000.0, "28 de Noviembre 1999");
        
        ing1.mostrarDatos();
        ing2.mostrarDatos();
        
        Director direc1 = new Director();
        Director direc2 = new Director("KIA", 2300, true, true, "SISTEMAS", true, "Sebastian", 23500, "26 DE JUNIO 2000");
        
        direc1.mostarDatos();
        direc2.mostarDatos();
        
        
               
        
        
        
    }
    
}
