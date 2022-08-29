/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class Gerente extends Empleado{
    
    String departamento;

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public String mostrarDepartamento(){
        return departamento;
    }
    
    @Override
      public void mostrarDatos(){
        System.out.println("Nombre: "+mostrarNombre() + "Salario: " + mostrarSalario()+ "Cumpleaños: "+mostrarCumpleaños()+"Departamento: "+ mostrarDepartamento());
        
    }
    
    
}
