/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6
 */
public class NumeroRacional {
    private int numerador;
    private int denominador;
    
    
    public NumeroRacional(){
        numerador=1;
        denominador=1;
        
    }
    
    public NumeroRacional(int numerador, int denominador){
        this.numerador=numerador;
        if(denominador==0){
            System.out.println("EL DENOMINADOR NO PUEDE SER 0");
        }else{
            this.denominador=denominador;
        }
        
        
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
       if(denominador==0){
            System.out.println("EL DENOMINADOR NO PUEDE SER 0");
        }else{
            this.denominador=denominador;
        }
    }
    
    public void Asignadatos(int numerador, int denominador){
        this.numerador=numerador;
              if(denominador==0){
            System.out.println("EL DENOMINADOR NO PUEDE SER 0");
        }else{
            this.denominador=denominador;
        }
        
        
    }
    
    public void Visualizarnum(){
        System.out.println(+getNumerador()+"/"+getDenominador());
    
    }
    
    public static NumeroRacional Sumarracional(NumeroRacional frac1, NumeroRacional frac2){
        NumeroRacional resul = new NumeroRacional();
        resul.denominador=frac1.denominador*frac2.denominador;
        resul.numerador=frac1.numerador*frac2.denominador+frac1.denominador*frac2.numerador;
        return resul;
    }
}

