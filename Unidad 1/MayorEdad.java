
package mayoredad;

import java.util.Scanner;


public class MayorEdad {


    public static void main(String[] args) {
        // Algoritmo en el que se itroduzca una edad y el sistema responda:
        //      *Si la edad es 18 o más imprime BIENVENIDO
        //      *Si la edad es menor a 18 imprime NO ACEPTADO
        
        //Definicion de variables
        byte edad = 0;
        
        
        //Datos de entrada
        System.out.println("Introduce tu edad: ");
        Scanner entrada = new Scanner(System.in);
        edad = entrada.nextByte();
        
        
        //Proceso
        if( edad >= 18 ){
            System.out.println("BIENVENIDO");
        }else{
            System.out.println("NO ACEPTADO");
        }
        
            
        //Datos de salida
        
    }
    
}
