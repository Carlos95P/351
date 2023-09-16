Algoritmo V2sumaMultiplicacionDosNumeros
	//Problema:Diseñar un algoritmo que pida al usuario dos numeros y que pida si los quiere multiplicar (se escoge 0) y si los
	//			quiere sumar (se escoge 1) e imprimir el resultado de la operacion elegida
	
	//1.Definición de variables
	Definir numero1 Como Entero
	Definir numero2 Como Entero
	Definir suma Como Entero
	Definir multiplicacion Como Entero
	Definir opcion Como Logico
	
	//2.Entrada de datos
	Escribir "Igresa el número 1: "
	Leer numero1
	Escribir "Igresa el número 2: "
	Leer numero2
	Escribir "Elige 0 para sumarlos o 1 para multiplicarlos: "
	Leer opcion
	
	//3.Procesamiento de datos
	Si opcion es Verdadero
		multiplicacion = numero1 * numero2
		Imprimir "La multiplicación es: ", multiplicacion
	FinSi
	Si opcion es Falso
		suma = numero1 + numero2
		Imprimir "La suma es: ", suma
	FinSi
	
	//4.Salida de datos
	
FinAlgoritmo
