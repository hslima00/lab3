package main;
import lab3.Complex;
public class Main {
    public static void main(String[] args){
        Complex num1 = new Complex(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        Complex num2 = new Complex(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
        //Complex num3 = Complex.add(num1,num2); //static
        //Complex num3 = num1.add(num2); //non static
        
        
        System.out.println("Add:\t\t\t "+ Complex.add(num1, num2).toString());
        System.out.println("Subtract:\t\t"+ Complex.subtract(num1, num2).toString());
        System.out.println("Multiply:\t\t"+ Complex.multiply(num1, num2).toString());

    }
}
