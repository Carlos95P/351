Algoritmo V2prestamosJubilados
	//Problema:Elabora un algoritmo que permita sacar un prestamo a un jubilado y determinar el valor de cada cuota sabiendo que:
	//			*Si paga en 6 cuotas el valor del prestamo incrementa 20%
	//			*Si paga en 12 cuotas incrementa un 30%
	//			*Si paga en 24 cuotas aumenta un 45%
	//1.Deefinición de variables
	Definir prestamo Como Entero
	Definir opcion Como Entero
	Definir cuotas6 Como Real
	Definir cuotas12 Como Real
	Definir cuotas24 Como Real
	Definir suma1 Como Real
	Definir suma2 Como Real
	Definir suma3 Como Real
	
	//2.Entrada de datos
	Escribir "Ingrese la cantidad del prestamo: "
	Leer prestamo
	Escribir "Ingrese 1 si paga en 6 cuotas, 2 si paga en 12 cuotas o 3 si paga en 24 cuotas: "
	Leer opcion
	
	//3.Procesamiento de datos
	Si(opcion == 1) Entonces
		cuotas6 = (prestamo * 0.20) / 6
		suma1 = prestamo + cuotas6
		Escribir "El valor de su cuota es: ", suma1
	FinSi
	Si(opcion == 2) Entonces
		cuotas12 = (prestamo * 0.30) / 12
		suma2 = prestamo + cuotas12
		Escribir "El valor de su cuota es: ", suma2
	FinSi
	Si(opcion == 3) Entonces
		cuotas24 = (prestamo * 0.45) / 24
		suma3 = prestamo + cuotas24
		Escribir "El valor de su cuota es: ", suma3
	FinSi
	Si(opcion > 3) Entonces
		Escribir "Opción no válida"
	FinSi
	
	//4.Salida de datos

	
FinAlgoritmo
