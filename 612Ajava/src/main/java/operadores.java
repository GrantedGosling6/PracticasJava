/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6
 */
public class operadores {
    
    public static void main(String[] args) {
        int num1, num2, resul ;
        num1=25;
        num2=12;
        
        System.out.println("Suma de num1 + num2: "+ (num1+num2));
        System.out.println("Multiplicacion de num1 y num2: "+ (num1*num2));
        System.out.println("Resta de num1 - num2: "+ (num1-num2));
        System.out.println("Division de num1 y num 2: "+(num1/num2));
        System.out.println("Modulo de num1 y num 2: "+(num1%num2));
        
        System.out.println("Operadores de comparación: ");
        System.out.println("Num1 menor que Num2: "+(num1<num2));
        System.out.println("Num1 mayor que Num2: "+(num1>num2));
        System.out.println("Num1 menor o igual que Num2: "+(num1<=num2));
        System.out.println("Num1 igual que Num2: "+(num1==num2));
        System.out.println("Num1 diferente que Num2: "+(num1!=num2));
        
        System.out.println("Operadores logicos");
        System.out.println("Num1 menor que num2" +(num1+num2 > 30 && num1-num2 <25));
        System.out.println("Uso de or : "+(num1+num2 > 30 || num1-num2 <25));
        System.out.println("Uso de not : "+ !(num1+num2 > 30 || num1-num2 <25));
        
        
        
    }
    
}
