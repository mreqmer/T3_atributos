package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// var

		// pedir radio y base del cilindro

		// mostrar menu
	}

	public static int menu() {
		int opc;

		System.out.println("1. Volumen");
		System.out.println("2. Area");
		System.out.println("0. Salir");
		System.out.println("Introduce una opción del menú: ");
		opc = sc.nextInt();

		return opc;
	}
	
	public static double pideN() {
		double n;
		System.out.println("Introduce un número: ");
		n = sc.nextDouble();
		return n;
	}
}
