Algoritmo V3sumaMultiplicacionDosNumeros
	//Problema:Dise�ar un algoritmo que pida al usuario dos numeros y que pida si los quiere multiplicar (se escoge 0) y si los
	//			quiere sumar (se escoge 1) si los quiere restar (escoge 2) si los quiere dividir (escoge 3)  e imprimir el resultado de la operacion elegida
	//1.Deefinici�n de variables
	Definir suma, resta, multiplicacion, division Como Entero
	Definir numero1, numero2 Como Entero
	Definir opcion Como Entero
	
	//2.Entrada de datos
	Escribir "Ingrese el n�mero 1: "
	Leer numero1
	Escribir "Ingrese el n�mero 2: "
	Leer numero2
	Escribir "Escoge 0 para multiplicar, 1 para sumar, 2 para restar o 3 para dividir: "
	Leer opcion
	
	//3.Procesamiento de datos
	Segun opcion Hacer
		0:
			multiplicacion = numero1 * numero2
			Escribir "La multiplicaci�n es: ", multiplicacion
		1:
			suma = numero1 + numero2
			Escribir "La suma es: ", suma
		2:
			resta = numero1 - numero2
			Escribir "La resta es: ", resta
		3:
			division = numero1 / numero2
			Escribir "La divisi�n es: ", division
		De Otro Modo:
			Imprimir "Opci�n no v�lida, escoja n�meros entre 0 y 3"
			
	FinSegun
	//4.Salida de datos
	
FinAlgoritmo
