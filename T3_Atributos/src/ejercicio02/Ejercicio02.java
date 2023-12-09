package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	
	/*
	 *ANCHO:2 ALTO:3 OPC. MENÚ:1|| RES. ESPERADO: 10  || RES. OBTENIDO: 10
	 *ANCHO:2 ALTO:3 OPC. MENÚ:2|| RES. ESPERADO: 6   || RES. OBTENIDO: 6
	 *OPC MENÚ: q || RES. ESPERADO: Error, Introduce una opción del menú. (vuelve a preguntar) || RES. OBTENIDO: Error, Introduce una opción del menú.(Vuelve a preguntar)
	 *ANCHO: q || RES. ESPERADO:Error, introduce un número (vuelve a preguntar) || RES. OBTENIDO: Error, introduce un número (vuelve a preguntar)
	 */
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Rectangulo rectangulo;
		// var
		//recoge la opción del menú
		int opc;
		//recogen los parámetros de las operaciones del rectángulo y el resultado
		double ancho, alto, resultado = 0;
		// guarda el ancho del rectángulo
		ancho = pideAncho();
		// pide el alto del rectángulo
		alto = pideAlto();

		// muestra el menú y recoge el número introducido
		opc = menu();

		// recoge las opciones del menu y devuelve el resultado de la operación correspondiente
		
		rectangulo = new Rectangulo(ancho, alto);
		
		switch (opc) {
		case 1 -> {
			resultado = rectangulo.perimetro();
			System.out.println("El perímetro es: " + resultado);
		}
		case 2 -> {
			resultado = rectangulo.area();
			System.out.println("El área es: " + resultado);
		}
		case 0 -> {
			System.out.println("FIN");
		}
		}
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
