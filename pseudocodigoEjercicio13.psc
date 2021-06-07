Algoritmo pseudocodigoEjercicio13
	Repetir
		Escribir "Seleccione una de las siguientes opciones: "
		Escribir "1.		Suma"
		Escribir "2.		Division"
		Escribir "3. 	Salir"
		Leer op
		Segun op Hacer
			1:
				Escribir "Ingrese los numeros a sumar: "
				Leer a,b
				suma=a+b
				Escribir "El resultado de la suma es: ",suma
				
			2:
				Escribir "Ingrese los numeros a dividir: "
				Leer a,b
				
				si b==0 Entonces
					Escribir "No se puede dividir entre cero"
				SiNo
					div=a/b
					Escribir "El resultado de la division es: ",div
				FinSi
				
			3:
				Escribir "Finalizo el proceso."
			De Otro Modo:
				Escribir "Opcion no valida"
		Fin Segun
		Escribir "Presione enter para continuar"
		Esperar Tecla
	Hasta Que op=3
FinAlgoritmo
