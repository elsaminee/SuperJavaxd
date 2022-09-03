/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author El Samin
 */
import java.util.Scanner;
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = sc.nextInt();
        int factorial = 0;
        int factorial2 = 1;
        for (int i = 1; i < num1; i++) {
            factorial= num1-i;
            factorial2 = factorial2*factorial;
        }
        
        int total = num1 * factorial2;
        
        System.out.println("El factorial de "+ num1 + " es "+total);
        
    }
    
}
