
package tipovariable;


public class TipoVariable {


    public static void main(String[] args) {
        // Declaración de variables
        boolean variableBooleana = false;
        System.out.println("El valor de la variable booleana es: "+variableBooleana);
        
        char variableChar = 'a';
        System.out.println("El valor de la variable char es: "+variableChar);
        
        byte variableByte = -128;
        System.out.println("El valor de la variable byte es: "+variableByte);
        
        short variableShort = 32767;
        System.out.println("El valor de la variable short es: "+variableShort);
        
        int variableInt = 2147483647;
        System.out.println("El valor de la variable int es: "+variableInt);
        
        //Variable long
        System.out.println("El valor de la variable long es: "+ Long.MIN_VALUE + " " + Long.MAX_VALUE);
        
        //Variable float
        System.out.println("El valor de la variable float es: "+ Float.MIN_VALUE + " " + Float.MAX_VALUE);
        
        //Variable double
        System.out.println("El valor de la variable double es: "+ Double.MIN_VALUE + " " + Double.MAX_VALUE);
        
    }
    
}
