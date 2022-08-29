/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Director extends Gerente{
    double bono;
    String automovil;

    public void setBono(double bono) {
        this.bono = bono;
    }

    public void setAutomovil(String automovil) {
        this.automovil = automovil;
    }
    
    public double mostrarBono(){
        return bono;
    }
    
    public String mostrarAutomovil(){
        return automovil;
    }
        @Override
      public void mostrarDatos(){
        System.out.println("Nombre: "+mostrarNombre() + "Salario: " + mostrarSalario()+ "Cumpleaños: "+mostrarCumpleaños()+"Departamento: "+ mostrarDepartamento()+ "Bono: "+mostrarBono()+"Automovil: "+mostrarAutomovil());
        
    }
}
