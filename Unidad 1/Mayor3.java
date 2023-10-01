
package mayor3;

import java.util.Scanner;


public class Mayor3 {


    public static void main(String[] args) {
        //Algoritmo: Dado tres numeros deducir cual es mayor
        //Definicion de variables
        byte num1 = 0;
        byte num2 = 0;
        byte num3 = 0;
        Scanner entrada=new Scanner(System.in);
        
        //Entrada de Datos
        System.out.println("Introduce el primer numero:");
        num1=entrada.nextByte();
        System.out.println("Introduce el segundo numero:");
        num2=entrada.nextByte();
        System.out.println("Introduce el tercer numero:");
        num3=entrada.nextByte();
        
        //Proceso
        if((num1>num2)&&(num1>num3)){
            System.out.println(num1+" es el numero mayor");
        }
        else if((num2>num1)&&(num2>num3)){
            System.out.println(num2+" es el numero mayor");
        }
        else{
            System.out.println(num3+" es el numero mayor");
        }
        
        //Salida de Datos
    }
    
}
