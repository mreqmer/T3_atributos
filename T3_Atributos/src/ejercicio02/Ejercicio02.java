package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Rectangulo rectangulo;
		// var
		int opc;
		double ancho, alto, resultado = 0;
		// pide ancho
		ancho = pideAncho();
		// pide alto
		alto = pideAlto();

		rectangulo = new Rectangulo(ancho, alto);
		// aqui va menu
		opc = menu();

		// recoge las opciones del menu
		switch (opc) {
		case 1 -> {
			resultado = rectangulo.perimetro();
		}
		case 2 -> {
			resultado = rectangulo.area();
		}
		case 0 -> {
			System.out.println("FIN");
		}
		}
		System.out.println("El resultado es: " + resultado);

	}

	// pide el ancho del rectángulo y comprueba que sea un valor válido
	public static double pideAncho() {
		double ancho = -1;

		do {
			try {
				System.out.println("Introduce el ancho: ");
				ancho = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error, introduce un número");
			} finally {
				sc.nextLine();
			}
		} while (ancho < 0);
		return ancho;
	}

	// pide la h del rectángulo y comprueba que sea un valor válido
	public static double pideAlto() {
		double alto = -1;

		do {
			try {
				System.out.println("Introduce el alto: ");
				alto = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error, introduce un número");
			} finally {
				sc.nextLine();
			}
		} while (alto < 0);
		return alto;
	}

	// muestra un menú y recoge la opción introducida
	public static int menu() {
		int opc = -1;
		do {
			try {
				System.out.println("1.Perímetro");
				System.out.println("2.Área");
				System.out.println("0.Salir");
				System.out.println("Introduce la opción:");
				opc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error, Introduce una opción del menú.");
			} finally {
				sc.nextLine();
			}

		} while (opc < 0 || opc > 2);

		return opc;

	}

}
