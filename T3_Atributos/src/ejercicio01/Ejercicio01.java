package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Operaciones op;
		// guarda el resultado de las operaciones
		double resultado = 0;
		// recoge la opción del menú
		int opc;
		// recoge los números introducidos por el usuario
		double n1, n2;

		// llama a la función para recoger la opción del menú
		opc = menu();

		//
		if (opc == 0) {
			System.out.println("FIN");
		} else {

			// llama a la función para recoger dos números
			n1 = pideN();
			n2 = pideN();

			// guarda la referencia de operaciones en la variable op
			op = new Operaciones(n1, n2);

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
			}
			System.out.println("El resultado es: " + resultado);

		}
	}

	public static int menu() {

		int opc;

		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Máximo");
		System.out.println("6. Mínimo");
		System.out.println("0. Salir");
		System.out.print("Introduce una opción del menú: ");

		opc = sc.nextInt();

		return opc;
	}

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
