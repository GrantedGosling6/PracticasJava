/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6 <https://github.com/GrantedGosling6>
 */
public class Director extends Gerente{
    protected String auto;
    protected double bono;
    protected boolean oficina;
    
    public Director(){
        empleado="NO TIENE";
        sueldo=1000;
        fechanac= "18 de junio de 1990";
        lugarE=false;
        area="SIN AREA";
        secre = false;
        auto="SIN ASIGNAR";
        bono=0;
        oficina=false;
    }

    public Director(String auto, double bono, boolean oficina, boolean lugarE, String area, boolean secre, String empleado, double sueldo, String fechanac) {
        super(lugarE, area, secre, empleado, sueldo, fechanac);
        this.auto = auto;
        this.bono = bono;
        this.oficina = oficina;
    }

    public void asignaAuto(String auto) {
        this.auto = auto;
    }

    public void asignaBono(double bono) {
        this.bono = bono;
    }

    public void asignaOficina(boolean oficina) {
        this.oficina = oficina;
    }
    
    public void mostarDatos(){
        System.out.println("Nombre: "+empleado);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Fecha de nacimiento: "+fechanac);
        System.out.println("Lugar de estacionamiento: "+lugarE);
        System.out.println("Area que dirige: "+area);
        System.out.println("Secretaria asignada: "+secre);
        System.out.println("Auto asignado: "+auto);
        System.out.println("Bono: "+bono);
        System.out.println("Oficina: "+oficina);
        System.out.println("-----------------------------------");
    }
    
}
