
package palabraclave;

import java.util.Scanner;


public class PalabraClave {


    public static void main(String[] args) {
        // Algoritmo que le pida al usuario una palabra:
        //          *Si la palabra es CONTADOR aplicar un 5% de descuento sobre la compra
        //          *Si la palabra es TARJETA aplicar un 3% de descuento sobre la compra
        //Definicion de variables
        String palabra = "";
        double des1 = 0;
        double mul1 = 0;
        double mul2 = 0;
        double des2 = 0;
        int compra;
        Scanner entrada = new Scanner(System.in);
        
        //Datos de entrada
        System.out.println("Ingresa la cantidad de la compra: ");
        compra = entrada.nextInt();
        System.out.println("Ingresa la palabra: ");
        palabra = entrada.next().toUpperCase();
        
        //Proceso
        if(palabra.equals("CONTADOR")){
            mul1= 0.05 * compra;
            des1 = compra - mul1;
            System.out.println("La palabra es correcta y tienes un 5% de descuento");
            System.out.println("El total de tu compra es: "+ des1);
        }
        else if(palabra.equals("TARJETA")){
            mul2 = 0.03 * compra;
            des2 = compra - mul2;
            System.out.println("La palabra es correcta y tienes un 3% de descuento");
            System.out.println("El total de tu compra es: "+ des2);
        }else{
            System.out.println("No tienes descuento, tu precio final es de: "+ compra);
        }
        
        //Datos de salida
        
        
    }
    
}
