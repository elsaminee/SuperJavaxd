/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double peso=0;
        int canti=0;
        int kgmen = -1;
        int kgmed = 0;
        int kgmax = 0;
        Scanner sc = new Scanner(System.in);
        do {
            
            System.out.println("Ingrese el peso en de cada pieza");
            peso = sc.nextDouble();
            
            if (peso >0) {
                canti=canti+1;
            }
            
            if (peso<9.8) {
                kgmen = kgmen+1;
            }else if (peso<=10.2) {
                kgmed = kgmed +1;
            }else if (peso > 10.2) {
                kgmax = kgmax +1;
            }
            
            
        } while (peso != 0);
        
        System.out.println("La piezas con un peso menor a 9.8 kg son: " +kgmen);
        System.out.println("La piezas con un peso entre 9.8 y 10.2 kg son: " +kgmed);
        System.out.println("La piezas con un peso mayor a 10.2 kg son: " +kgmax);
        
        System.out.println("La cantidad total de piezas procesadas es de: " + canti);
        
    }
    
}
