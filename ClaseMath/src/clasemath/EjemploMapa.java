/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasemath;
import java.util.*;
/**
 *
 * @author Fernando
 */
public class EjemploMapa {
    public static void main(String[] args) {
        Map mapa = new HashMap();
        mapa.put("uno","primero");
        mapa.put("segundo", new Integer(2));
        mapa.put("tercero", "3ro");
        mapa.put("tercer", "III");
        Set set1=mapa.keySet();
        Collection coleccion=mapa.values();
        Set set2=mapa.entrySet();
        System.out.println(set1+"\n"+coleccion+"\n"+set2);
    }
    
}
