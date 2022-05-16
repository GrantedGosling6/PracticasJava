/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GrantedGosling6
 */
public class Cuenta {
    
    protected double saldo;
    protected int numCuenta;
    protected String cliente;
    protected double interes;
    
   public Cuenta(int NC, String tit, double sal, double ti){
       numCuenta=NC;
       cliente=tit;
       saldo=sal;
       interes=ti;
       
   } 
    
    public void mostrarSaldo(){
        System.out.println("Saldo: "+ saldo);
    }
    public void Deposito(double depo){
        saldo+=depo;
        
    }
    public void Retiro(double ret){
        if(saldo>=ret && ret > 0 && ret <= 9800){
            saldo-= ret;
            System.out.println("Retiro realizado, quedan:  "+saldo+"Pesos Mexicanos" );
        }else{
            System.out.println("Rechazado, verifica los datos");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void mostrarcuenta(){
        System.out.println("Numero de cuenta: "+numCuenta);
        System.out.println("Titular: "+cliente);
        System.out.println("Tasa de interes: "+interes);
        System.out.println("Saldo actual: "+ saldo);
        System.out.println("------------------------------");
        
    }
    
    
}
