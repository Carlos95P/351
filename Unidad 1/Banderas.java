
package banderas;


public class Banderas {


    public static void main(String[] args) {
        //Definicion de variables
        boolean variableBandera1 = false;
        boolean variableBandera2 = false;
        boolean variableBandera3 = false;
        
        byte edadPedrito = 8;
        byte edadAna = 20;
        byte edadLupe = 35;
        
        //Entrada de datos
        
        
        //Proceso
        variableBandera1 = (edadPedrito == edadAna);
        variableBandera2 = (edadPedrito > edadLupe);
        variableBandera3 = !((variableBandera1)||(variableBandera2));
        
        //Salida de datos
        //System.out.println("El valor de la bandera es: " + variableBandera1);
        if(variableBandera3){
        
            System.out.println("El valor de la evaluacion es: " + variableBandera3);
        
        }else{
            
            System.out.println("El valor de la bandera es false");
            
        }
    }
    
}
