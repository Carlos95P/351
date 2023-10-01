Algoritmo covidMexico
	//Problema:Diseñar un algoritmo que calcule por cada millón de habitantes la cantidad de contagios por COVID y la
	//			cantidad de muertes por COVID en México
	
	//1.Deefinición de variables
	Definir CantidadContagios Como Entero
	Definir CantidadMuertos Como Entero
	Definir CantidadHabitantes Como Entero
	Definir TasaContagios Como Real
	Definir TasaMuertos Como Real
	
	//2.Entrada de datos
	Escribir "Ingrese la Cantidad de Contagios: "
	Leer CantidadContagios
	Escribir "Ingrese la Cantidad de Muertos: "
	Leer CantidadMuertos
	Escribir "Ingrese la Cantidad de Habitantes: "
	Leer CantidadHabitantes
	
	//3.Procesamiento de datos
	TasaContagios = (CantidadContagios * 1000000) / CantidadHabitantes
	TasaMuertos = (CantidadMuertos * 1000000) / CantidadHabitantes
	
	//4.Salida de datos
	Imprimir "La Tasa de Contagios es de: ", TasaContagios
	Imprimir "La Tasa de Muertos es de: ", TasaMuertos
	
FinAlgoritmo
