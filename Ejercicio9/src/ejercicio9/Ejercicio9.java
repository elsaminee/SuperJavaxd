/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author El Samin
 */

import java.lang.Math;

public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int total=0;
        int cali=0;
        for (int j = 0; j < 3; j++) {
            n = (int) (Math.random() *6 + 1);
            total= total + n;
            System.out.println("El dado es: "+ n);
            
            if (n==6) {
                cali = cali+1;
            }
                    
        }
        
       
        switch (cali){
            case 0 -> System.out.println("Pesimo");
            case 1 -> System.out.println("regular");
            case 2 -> System.out.println("Muy bien");
            case 3 -> System.out.println("Excelente");
            default -> System.out.println("Algo salio mal");
                
                
        }
    }
    
}
