/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Empleado {
    String nombre;
    double salario;
    String cumpleaños;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
    
    public String mostrarNombre(){
        return nombre;
    }
    public double mostrarSalario(){
        return salario;
    }
    public String mostrarCumpleaños(){
        return cumpleaños;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+mostrarNombre() + "Salario:  " + mostrarSalario()+ "Cumpleaños: "+mostrarCumpleaños());
        
    }
    
}
