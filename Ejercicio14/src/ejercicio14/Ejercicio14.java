/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author El Samin
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int i=0;
        double ini=0;
        double fin=10;
        double cam=10;
        double cambiox =(fin-ini)/cam;
        double resul1;
        double resuli;
        double sub1=0;
        double sub2=0;
        double subp;
        double subi;
        int poi;
        double integral;
       
        
        subp = Math.pow(i+ini, 2)+ i;
        subi = Math.pow(i+fin,2) +i;
        
        
        for ( i = 1; i < cam; i++) {
            
            resul1 = ini + i*cambiox ;
            resuli = Math.pow(resul1, 2)+ resul1 ;
            
            poi= (int)(i%2);
            if (poi ==0){
                
                sub1= sub1 + resuli;
            }else {
                sub2 = sub2 +resuli;
            }
            
        }
        
        integral = (cambiox/3)*(subp+subi+2*sub1+4*sub2);
        System.out.println(integral);
    }
    
}
