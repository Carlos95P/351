
package cifrasnumeros;

import java.util.Scanner;


public class CifrasNumeros {


    public static void main(String[] args) {
        // Algoritmo que le pida al usuario un digito y el programa le diga cuantas cifras son
        
        //Definicion de variables
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        
        
        //Datos de entrada
        System.out.println("Ingresa un digito: ");
        num = entrada.nextInt();
        
        
        //Proceso
        if(num<10){
            System.out.println("El digito ingresado es de una cifra.");
        }
        else if(num>9 && num<100){
            System.out.println("El digito ingresado es de dos cifras.");
        }
        else if(num>99 && num<1000){
            System.out.println("El digito ingresado es de tres cifras.");
        }
        else if(num>999 && num<10000){
            System.out.println("El digito ingresado es de cuatro cifras.");
        }
        
        //Datos de salida
        
    }
    
}
