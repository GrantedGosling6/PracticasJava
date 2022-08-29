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
public class EjemploSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("uno");
        set.add("segundo");
        set.add("30");
        set.add(new Integer(4));
        set.add(new Float(5.0F));
        set.add("segundo");
        set.add(new Integer(4));
        System.out.println(set);
        
    }
    
}
