/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabuena;

/**
 *
 * @author andres
 */
public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora() {
 
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double sumar(){
        return num1+num2;
    }
    public double restar(){
        return num1-num2;
    }
    public double multiplicar(){
        return num1*num2;
    }
    public double dividir(){
        return num1/num2;
    }
    public double potencia(){
        return Math.pow(num1,num2);
    }
    
    public double raiz(){
         return Math.pow(num1,(1/num2));
    }
    public double tangente(){
        return Math.tan(num1);
    }
    public double seno(){
        return Math.sin(num1);
    }
    public double coseno(){
        return Math.cos(num1);
    }
   
}
