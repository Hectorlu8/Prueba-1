SubProceso entrada_datos(filas,columnas,datos)
	definir fila como entero;
	definir cola Como Entero;
	fila<-1;
	cola<-1;
	mientras fila<=filas Hacer
		Escribir "Dame el valor de ",fila,cola;
		leer datos[fila,cola];
			
			
		fila<-fila+1;
	FinMientras
FinSubProceso

SubProceso sueldo_final(datos)
	definir L Como Entero;
	definir indice Como Entero;
	L<-1;
	Mientras indice<10 Hacer
		
		Si datos[0,indice]<=1500000 Entonces
			datos[L,indice]<-datos[0,indice]*1.01;
		FinSi
		Si datos[0,indice]<=4000000 Entonces
			datos[L,indice]<-datos[0,indice]*0.93;
		FinSi
		Si expresion_logica Entonces
			
		FinSi
		Si expresion_logica Entonces
			
		FinSi
	indice<-indice+1;
	FinMientras
	
	
FinSubProceso

SubProceso imprimir_tabla(filas,datos)
	definir L,C Como Entero;
	L<-0;
	escribir "Sueldo inicial         Sueldo final  ";
	Repetir
		Para C<-0 hasta 1 con paso 1 Hacer
			Escribir datos[L,C],"           " sin bajar;
			
		FinPara
		L<-L+1;
	Hasta Que L<filas
	
FinSubProceso


Proceso sin_titulo
	Dimension sueldo_0[50,30];
	definir sueldo_0 como real;
	definir sueldos Como Real;
	definir indice como entero;
	Definir filas Como Entero;
	definir columnas Como Entero;
	Escribir "Cuantas filas tendra la tabla";
	leer filas;
	Escribir "Cuantas columnas tendra la tabla";
	leer columnas;
	
	entrada_datos(filas,columnas,sueldo_0);
	
	imprimir_tabla(filas,sueldo_0);
	
FinProceso
