package formulageneral;

import java.util.Scanner;


public class FormulaGeneral {


    public static void main(String[] args) {
    //Definir variables
        Scanner entrada= new Scanner(System.in);
        double a,b,c = 0;
        double x1,x2 = 0;
        double d=0;
    //Entrada de datos
    System.out.println("Dame la variable a: ");
    a= entrada.nextInt();
    System.out.println("Dame la variable b: ");
    b= entrada.nextInt();
    System.out.println("Dame la variable c: ");
    c= entrada.nextInt();
    // Procesamiento de datos
    d= Math.pow(b, 2) -4*a*c;
    
    if(d<0){
        System.out.println("La solucion no existe: ");
    }else{
        x1 = (b + Math.sqrt(d)) /2*a;
        x2 = (b - Math.sqrt(d)) /2*a;
        System.out.printf("La solucion es: S= (x1 %f , x2 %f) \n-1" ,x1, x2);
        
    }
    //Salida de datos
    }
    
}
