
package pkg351fechacorrecta;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        // Definir variables
        int dia, mes, anno;
        Scanner entrada = new Scanner(System.in);
        
        //Entrada de datos
        System.out.println("Introduce dia: ");
        dia = entrada.nextInt();
        System.out.println("Introduce mes: ");
        mes = entrada.nextInt();
        System.out.println("Introduce anno: ");
        anno = entrada.nextInt();
        
        //Proceso
        if(anno == 0){
            System.out.println("Fecha Incorrecta");
        }else{
            if(mes==2 && (dia>=1 && dia<=28)){
                System.out.println(dia + "/"+ mes +"/"+ anno +" fecha correcta");
            }else{
                if((mes==4 || mes==6 || mes==9 || mes==11) && (dia>=1 && dia<=30)){
                    System.out.println(dia + "/"+ mes +"/"+ anno +" fecha correcta");
                }else{
                    if((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia>=1 && dia<=31)){
                        System.out.println(dia + "/"+ mes +"/"+ anno +" fecha correcta");
                    }else{
                        System.out.println("Fecha INCORRECTA!!!!!!!");
                    }
                }
            }
        }
        
        //Salida de datos
    }
    
}
