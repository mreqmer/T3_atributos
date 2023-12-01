package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// Var
		Circulo circulo;
		double r, resultado=0;
		int opc;
		//pedir radio
		
			r = pideRadio();
			// mostrar menu
			opc = menu();
			//
			circulo = new Circulo(r);
		while (opc != 0){
			switch (opc) {
			case 1 -> resultado = circulo.circunferencia();
			case 2 -> resultado = circulo.area();
			}
			System.out.println("El resultado es: " + resultado);
			opc = menu();
		}
		
		
		System.out.println("FIN");
		
	}
	//muestra un menú y pide la opción
	public static int menu() {
		int opc=-1;
		do {
			try {
				System.out.println("1.Circunferencia");
				System.out.println("2.Área");
				System.out.println("0.Salir");
				System.out.println("Introduce una opción del menú: ");
				opc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error. Introduce un número.");
			} finally {

			}
		} while (opc < 0 || opc > 2);
		return opc;
	}
	public static double pideRadio() {
		double radio=-1;
		do {
			try {
				System.out.println("Introduce el radio: ");
				radio = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error. Introduce un número.");
			} finally {

			}
		} while (radio < 0);
		return radio;
		
	}

}
