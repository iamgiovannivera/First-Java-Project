/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author wrl123u
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    static int Hours;
    
    public static void main(String[] args) {
        int hours = 40;
        // TODO code application logic here
        Hours = 40;
        double PayRate = 16.5;
        
        double Payment;
        Payment = Hours * PayRate;
        
        System.out.println("$"+Payment);
    }
    
}
