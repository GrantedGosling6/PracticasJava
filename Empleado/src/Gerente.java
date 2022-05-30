/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6 <https://github.com/GrantedGosling6>
 */
public class Gerente extends Empleado{ //HERENCIA DE LA CLASE EMPLEADO
    protected boolean lugarE;
    protected String area;
    protected boolean secre;
    
    
    public Gerente(){
        empleado="NO TIENE";
        sueldo=1000;
        fechanac= "18 de junio de 1990";
        lugarE=false;
        area="SIN AREA";
        secre = false;
        
    }

    public Gerente(boolean lugarE, String area, boolean secre, String empleado, double sueldo, String fechanac) {
        super(empleado, sueldo, fechanac);//LLAMADA A LA SUPERCLASE
        this.lugarE = lugarE;
        this.area = area;
        this.secre = secre;
    }

    public void asignaLugarE(boolean lugarE) {
        this.lugarE = lugarE;
    }

    public void asignaArea(String area) {
        this.area = area;
    }

    public void asignaSecre(boolean secre) {
        this.secre = secre;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+empleado);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Fecha de nacimiento: "+fechanac);
        System.out.println("Lugar de estacionamiento: "+lugarE);
        System.out.println("Area que dirige: "+area);
        System.out.println("Secretaria asignada: "+secre);
        System.out.println("-----------------------------------");
    }
    

    
    
    
}
