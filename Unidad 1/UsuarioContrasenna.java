package usuariocontrasenna;

import java.util.Scanner;

public class UsuarioContrasenna {

    public static void main(String[] args) {
        // Realiza un programa que solicit un usuario y una contraseña, el usuario y la contraseña deben ser: UPVM y 351
        //      *Si son correctas dar acceso y mostrar un mensaje de bienvenida
        //      *Si no son correctas negar el acceso
        //Definicion de variables
        Scanner entrada = new Scanner(System.in);
        String usuario = "";
        String contrasenna = "";
        
        //Entrada de datos
        System.out.println("Ingrese el Usuario: ");
        usuario = entrada.next();
        System.out.println("Ingrese la Contraseña: ");
        contrasenna = entrada.next();
        
        //Proceso
        if(usuario.equals("UPVM") && contrasenna.equals("351")){
            System.out.println("Bienvenido, ACCESO concedido");
        }else{
            System.out.println("ACCESO DENEGADO, Usuario o Contraseña incorrecta.");
        }
        
        
        //Salida de datos
        
        
    }
    
}
