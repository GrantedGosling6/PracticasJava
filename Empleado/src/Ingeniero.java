/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6 <https://github.com/GrantedGosling6>
 */
public class Ingeniero extends Empleado{
    
    protected String pc;
    protected double bono;
    
    public Ingeniero(){
        empleado="NO TIENE";
        sueldo=1000;
        fechanac= "18 de junio de 1990";
        pc="NO ASIGNADA";
        bono=2600;
    }

    public Ingeniero(String pc, double bono, String empleado, double sueldo, String fechanac) {
        super(empleado, sueldo, fechanac);
        this.pc = pc;
        this.bono = bono;
    }

    public void asignaPc(String pc) {
        this.pc = pc;
    }

    public void asignaBono(double bono) {
        this.bono = bono;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+empleado);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Fecha de nacimiento: "+fechanac);
        System.out.println("PC Asignada: "+pc);
        System.out.println("Bono: "+bono);
        System.out.println("-----------------------------------");
    }
    
    
    
    
    
}
