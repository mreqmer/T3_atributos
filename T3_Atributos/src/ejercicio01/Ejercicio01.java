package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	/*
	 *OPCIÓN MENÚ: 1 NÚMEROS INTRODUCIDOS: 2, 3 || RES. ESPERADO: 5  || RES. OBTENIDO: 5
	 *OPCIÓN MENÚ: 2 NÚMEROS INTRODUCIDOS: 2, 3 || RES. ESPERADO: -1 || RES. OBTENIDO: -1
	 *OPCIÓN MENÚ: q          || RES. ESPERADO: Introduce un número del 1-6: (vuelve a preguntar) || RES. OBTENIDO: Introduce un número del 1-6: (vuelve a preguntar)
	 *NÚMEROS INTRODUCIDOS: q || RES. ESPERADO: Error. Introduce un número (vuelve a preguntar) || RES. OBTENIDO: Error. Introduce un número (vuelve a preguntar)
	 */

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Operaciones op;
		// guarda el resultado de las operaciones
		double resultado = 0;
		// recoge la opción del menú
		int opc;
		// recoge los números introducidos por el usuario
		double numero1, numero2;

		// llama a la función para recoger la opción del menú
		opc = menu();

		// si la opción es 0 finaliza el programa, si no se inicia un bucle para pedir
		// las opciones y los números cada vez hasta que se introduce un 0 en el menú
		if (opc == 0) {
			System.out.println("FIN");
		} else {
			do {
				// llama a la función para recoger dos números
				numero1 = pideN();
				numero2 = pideN();

				// guarda la referencia de operaciones en la variable op
				op = new Operaciones(numero1, numero2);

				// recoge la opción del menú para hacer la operación
				switch (opc) {
				case 1 -> {
					resultado = op.suma();
				}
				case 2 -> {
					resultado = op.resta();
				}
				case 3 -> {
					resultado = op.multiplicacion();
				}
				case 4 -> {
					resultado = op.div();
				}
				case 5 -> {
					resultado = op.max();
				}
				case 6 -> {
					resultado = op.min();
				}
				}// switch

				System.out.println("El resultado es: " + resultado);
				// menú al final del bucle para que vuelva a aparecer y se vuelva a recoger el
				// número de la opción
				opc = menu();
			} while (opc != 0);
			// mensaje de finalización del programa
			System.out.println("FIN");
		}

	}

	// menú
	public static int menu() {

		int opc = -1;

		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Máximo");
		System.out.println("6. Mínimo");
		System.out.println("0. Salir");

		do {
			try {
				System.out.print("Introduce una opción del menú: ");
				opc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Introduce un número del 1-6: ");
			} finally {
				sc.nextLine();
			}
		} while (opc < 0 || opc > 6);

		return opc;
	}

	// pide un número y comprueba si este es correcto
	public static double pideN() {
		double numero = 0;
		boolean comprueba = true;

		do {
			try {
				System.out.println("Introduce un número:");
				numero = sc.nextDouble();
				comprueba = false;
			} catch (InputMismatchException e) {
				System.out.println("Error. Introduce un número");
			} finally {
				sc.nextLine();
			}

		} while (comprueba);

		return numero;

	}

}