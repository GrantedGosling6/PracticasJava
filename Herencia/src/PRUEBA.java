/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fernando
 */
public class PRUEBA {
    public static void main(String[] args) {
                Empleado emp1 = new Empleado();
        emp1.setNombre("Fernando");
        emp1.setSalario(3456.23);
        emp1.setCumpleaños("29 DE JUNIO");
        emp1.mostrarDatos();
        
                        Gerente ger1 = new Gerente();
        ger1.setNombre("Eduardo");
        ger1.setSalario(6756.23);
        ger1.setCumpleaños("20 de noviembre");
        ger1.setDepartamento("UNIDAD HABITACIONAL");
        ger1.mostrarDatos();
        
                                Director dir1 = new Director();
        dir1.setNombre("Luis");
        dir1.setSalario(6756.23);
        dir1.setCumpleaños("20 de noviembre");
        dir1.setDepartamento("UNIDAD HABITACIONAL");
        dir1.setAutomovil("KIA");
        dir1.setBono(3000);
        dir1.mostrarDatos();
    }
}
