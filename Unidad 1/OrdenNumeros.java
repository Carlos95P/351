
package ordennumeros;

import java.util.Scanner;


public class OrdenNumeros {


    public static void main(String[] args) {
        // Algoritmo: Realizar un numero que solicite al usuario 3 numeros y los ordene de menor a mayor
        // Definición de variables
        byte num1 = 0;
        byte num2 = 0;
        byte num3 = 0;
        Scanner entrada=new Scanner(System.in);
        
        // Datos de entrada
        System.out.println("Introduce el primer numero:");
        num1=entrada.nextByte();
        System.out.println("Introduce el segundo numero:");
        num2=entrada.nextByte();
        System.out.println("Introduce el tercer numero:");
        num3=entrada.nextByte();
        
        // Proceso
        if((num1<num2)&&(num2<num3)){
            System.out.println("El orden de los numeros de menor a mayor es: "+ num1 +", "+ num2 +", "+num3);
        }
        else if((num3<num2)&&(num2<num1)){
            System.out.println("El orden de los numeros de menor a mayor es: "+ num3 +", "+ num2 +", "+num1);
        }
        else if((num2<num1)&&(num1<num3)){
            System.out.println("El orden de los numeros de menor a mayor es: "+ num2 +", "+ num1 +", "+num3);
        }
        else if((num3<num1)&&(num1<num2)){
            System.out.println("El orden de los numeros de menor a mayor es: "+ num3 +", "+ num1 +", "+num2);
        }
        else if((num1<num3)&&(num3<num2)){
            System.out.println("El orden de los numeros de menor a mayor es: "+ num1 +", "+ num3 +", "+num2);
        }
        else{
            System.out.println("El orden de los numeros de menor a mayor es: "+ num2 +", "+ num3 +", "+num1);
        }
        
        // Salida de datos
        
        
    }
    
}
