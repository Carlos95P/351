
package diadescuento;

import java.util.Scanner;


public class DiaDescuento {


    public static void main(String[] args) {
        // Realiza un programa que solicite al usuario la cantidad de su compra y que introduzca un dia de la semana
        //          *Si el dia introducido es Martes o Jueves se le aplica un 10% de descuento en la compra
        //          *Si introduce otro dia no se le aplica ningun descuento
        // Definicion de variables
        Scanner entrada = new Scanner(System.in);
        int compra = 0;
        double descuento = 0;
        double total= 0;
        String dia = "";
        
        // Entrada de datos
        System.out.println("Ingrese el total de su compra: ");
        compra = entrada.nextInt();
        System.out.println("Ingrese un dia de la semana: ");
        dia = entrada.next();
        
        // Proceso
        if(dia.equalsIgnoreCase("Martes") || dia.equalsIgnoreCase("Jueves")){
            descuento = compra * 0.10;
            total = compra - descuento;
            System.out.println("Seleccionaste un buen dia, tienes un descuento del: "+ descuento);
            System.out.println("El total de tu compra es: "+ total);
            
        }else{
            System.out.println("No se te aplico ningun descuento, tu total es de: "+ compra);
        }
        
        
        // Salida de datos
        
        
    }
    
}
