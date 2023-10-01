package v2mayoredad;

import java.util.Scanner;

public class V2mayorEdad {


    public static void main(String[] args) {
        // Algoritmo en el que se itroduzca una edad y el sistema responda:
        //      *Si la edad es de 0-5 imprime BIENVENIDO NIÑO
        //      *Si la edad es de 6-15 imprime BIENVENIDO JOVEN
        //      *Si la edad es de 16-18 imprime BIENVENIDO
        //      *Si la edad es de 19-100 imprime BIENVENIDO ADULTO
        
        //Definicion de variables
        byte edad = 0;
        
        
        //Datos de entrada
        System.out.println("Introduce tu edad: ");
        Scanner entrada = new Scanner(System.in);
        edad = entrada.nextByte();
        
        
        //Proceso
        switch(edad){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("BIENVENIDO NIÑO");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("BIENVENIDO JOVEN");
                break;
            case 16:
            case 17:    
            case 18:
                System.out.println("BIENVENIDO");
                break;
            case 19:
            case 100:
                System.out.println("BIENVENIDO ADULTO");
                break;
            default:
                System.out.println("Hola");
        }
        
            
        //Datos de salida
        
    }
    
}
