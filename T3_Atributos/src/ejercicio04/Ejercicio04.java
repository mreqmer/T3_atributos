package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
	
	/*
	 *RADIO: 2 ALTURA: 1 OPC.MENU: 1 || RES. ESPERADO: El volumen del cilindro es de 6.283185307179586  || RES. OBTENIDO: El volumen del cilindro es de 6.283185307179586
	 *RADIO: 3 ALTURA: 1 OPC.MENU: 2 || RES. ESPERADO: El área del cilindro es de 25.132741228718345    || RES. OBTENIDO: El área del cilindro es de 25.132741228718345
	 *RADIO: q     || RES. ESPERADO: Error, introduce un número válido. (vuelve a preguntar) || RES. OBTENIDO: Error, introduce un número válido. (vuelve a preguntar)
	 *OPC. MENU: q || RES. ESPERADO: Error, introduce un número válido. (vuelve a preguntar) || RES. OBTENIDO: Error, introduce un número válido. (vuelve a preguntar)
	 */
	

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		// var
		Cilindro cilindro;
		// guarda el radio y la altura del cilindro y el resultado de las operaciones
		double radioBase, altura, resultado;
		// guarda la opción del menú introducida
		int opc;
		// bucle en el cual se va a pedir el radio y la altura de un cilindro hasta que
		// se finalice el programa introduciendo un 0 en el menú
		do {
			// pedir radio y base del cilindro
			radioBase = pideRadioBase();
			altura = altura();
			// mostrar menu
			opc = menu();
			cilindro = new Cilindro(radioBase, altura);
			// recoge la opción del menú y realiza el cálculo necesario, además devuelve el
			// resultado
			switch (opc) {
			case 1 -> {
				resultado = cilindro.volumen();
				System.out.println("El volumen del cilindro es de " + resultado);
			}
			case 2 -> {
				resultado = cilindro.area();
				System.out.println("El área del cilindro es de " + resultado);
			}
			}

		} while (opc != 0);

		// mensaje de finalización del programa
		System.out.println("FIN");
	}

	// muestra las opciones del menú, recoge el valor introducido y comprueba que
	// sea válido
	public static int menu() {
		int opc = -1;
		do {
			try {
				System.out.println("1. Volumen");
				System.out.println("2. Area");
				System.out.println("0. Salir");
				System.out.println("Introduce una opción del menú: ");
				opc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error. Introduce un número válido.");
			} finally {
				sc.nextLine();
			}

		} while (opc < 0 || opc > 2);

		return opc;
	}

	// pide un radio del cilindro y comprueba que sea válido
	public static double pideRadioBase() {
		double radioBase = -1;
		do {
			try {
				System.out.println("Introduce un el rádio del cilindro: ");
				radioBase = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error. Introduce un número válido.");
			} finally {
				sc.nextLine();
			}
		} while (radioBase < 0);

		return radioBase;
	}

	// pide la altura del cilindro y comprueba que sea válido
	public static double altura() {
		double altura = -1;
		do {
			try {
				System.out.println("Introduce la altura del cilindro:");
				altura = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error. Introduce un número válido:");
			} finally {
				sc.nextLine();
			}
		} while (altura < 0);
		return altura;
	}

}
