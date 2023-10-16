package calculadora;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        // Definir variables
        int a=0;
        int b=0;
        Scanner entrada=new Scanner(System.in);
        String opcion="";
        
        //Entrada de datos
        System.out.println("********** Menu Principal *********");
        
        
        //Proceso
        do{
            System.out.println("Dame la operacion: suma, resta, multiplicacion, division, salir");
            opcion = entrada.nextLine();
            
            
            switch(opcion){
                case "suma":
                    System.out.println("Valor de a: ");
                    a= Integer.parseInt(entrada.nextLine());
                    System.out.println("Valor de b: ");
                    b= Integer.parseInt(entrada.nextLine());
                    System.out.println("La suma es: "+ (a+b));
                    break;
                case "resta":
                    System.out.println("Valor de a: ");
                    a= Integer.parseInt(entrada.nextLine());
                    System.out.println("Valor de b: ");
                    b= Integer.parseInt(entrada.nextLine());
                    System.out.println("La resta es: "+ (a-b));
                    break;
                case "multiplicacion":
                    System.out.println("Valor de a: ");
                    a= Integer.parseInt(entrada.nextLine());
                    System.out.println("Valor de b: ");
                    b= Integer.parseInt(entrada.nextLine());
                    System.out.println("La multiplicacion es: "+ (a*b));
                    break;
                case "division":
                    System.out.println("Valor de a: ");
                    a= Integer.parseInt(entrada.nextLine());
                    System.out.println("Valor de b: ");
                    b= Integer.parseInt(entrada.nextLine());
                    System.out.println("La division es: "+ (a/b));
                    break;
            }
            
        }while(!"salir".equals(opcion));
        
        
        //Salida de datos
        
        
    }
    
}
