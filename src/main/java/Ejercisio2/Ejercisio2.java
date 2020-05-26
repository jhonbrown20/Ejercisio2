
package Ejercisio2;

import java.util.Scanner;

public class Ejercisio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1;
        int cifras;
        System.out.println(" por favor introducir un numero");
        n1=entrada.nextInt();
        
        
        cifras = String.valueOf(n1).length();
        
        if(n1>10 && n1<10000){
            System.out.println(" el numero de cifras es "+cifras);
        }
        else {
            System.out.println(" esta fuera de rango");
            
        }
        
        
    }
    
}
