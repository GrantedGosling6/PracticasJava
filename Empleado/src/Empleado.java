/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6 <https://github.com/GrantedGosling6>
 */
public class Empleado {
    
  protected  String empleado; //atributos 
  protected  double sueldo;   
  protected  String fechanac;
    
    
    public Empleado(){   //constructor estandar
        empleado="NO TIENE";
        sueldo=1000;
        fechanac= "18 de junio de 1990";
    }

    public Empleado(String empleado, double sueldo, String fechanac) { //constructor con parametros
        this.empleado = empleado;
        this.sueldo = sueldo;
        this.fechanac = fechanac;
    }

    public Empleado(String empleado, double sueldo) {
        this.empleado = empleado;
        this.sueldo = sueldo;
    }
    
    public void asignaNombre(String empleado){//METODOS
        this.empleado=empleado;
    }
    
    public void asignaSueldo(double sueldo){//METODOS
        this.sueldo=sueldo;
        
    }
    public void asignaFecha(String fechanac){//METODOS
        this.fechanac=fechanac;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+empleado);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Fecha de nacimiento: "+fechanac);
        System.out.println("-----------------------------------");
        
    }
    
    
    
}
