import java.util.*;

public class Ejercicio13{

	public static void main(String[] args) {
		//Declaramos variables
		Scanner scanner = new Scanner(System.in);
		double numA;
		double numB;
		double div;
		int op;
		double suma;
		//creamos un ciclo que nos de las opciones a realizar
		
		do{

			System.out.println("Ingrese una de las siguientes opciones: ");
			System.out.println("1.	Suma");
			System.out.println("2.	Division");
			System.out.println("3.	Salir");
			op = scanner.nextInt();
			//dependiendo de la opcion elegida se haran:
			switch(op){
			case 1:
				System.out.println("Ingrese los numeros a sumar: ");
				numA = scanner.nextDouble();
				numB = scanner.nextDouble();
				suma = numA+numB;
				System.out.println("El resultado de la suma es: "+suma);
				break;
			case 2:
				System.out.println("Ingrese los numeros a dividir: ");
				numA = scanner.nextDouble();
				numB = scanner.nextDouble();
				if (numB == 0) {
					System.out.println("No se puede dividir entre cero");					
				} else{
					div = numA/numB;
					System.out.println("El resultado de la division es: "+div);
				}
				break;
			case 3:
				System.out.println("Finalizo el proceso.");
				break;
			default:
				System.out.println("Opcion no valida");			
			}
			Scanner waitForKeypress = new Scanner(System.in);
			System.out.println("Presione enter para continuar");
			waitForKeypress.nextLine();
			
		} while (op!=3);
	}
}