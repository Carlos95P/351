Algoritmo sumaMultiplicacionDosNumeros
	//Problema:Dise�ar un algoritmo que pida al usuario dos numeros y que pida si los quiere multiplicar (se escoge 0) y si los
	//			quiere sumar (se escoge 1) e imprimir el resultado de la operacion elegida
	//1.Definici�n de variables
	Definir numeroUno Como Entero
	Definir numeroDos Como Entero
	Definir suma Como Entero
	Definir multiplicacion Como Entero
	Definir opcion Como Entero
	//2.Entrada de datos
	Escribir "Igresa el n�mero 1: "
	Leer numeroUno
	Escribir "Igresa el n�mero 2: "
	Leer numeroDos
	Escribir "Elige 0 para sumarlos o 1 para multiplicarlos: "
	Leer opcion
	//3.Procesamiento de datos
	Si (opcion = 0) Entonces
		suma = numeroUno + numeroDos
		Imprimir "La suma es: ", suma
	FinSi
	Si (opcion = 1) Entonces
		multiplicacion = numeroUno * numeroDos
		Imprimir "La multiplicaci�n es: ", multiplicacion
	FinSi
	//4.Salida de datos
	
	
FinAlgoritmo
