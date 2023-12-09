package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
	
	/*
	 *RADIO: 2 OPC.MENU: 1 || RES. ESPERADO: El perímetro de la circunferencia es: 12.566370614359172  || RES. OBTENIDO: El perímetro de la circunferencia es: 12.566370614359172
	 *RADIO: 3 OPC.MENU: 2 || RES. ESPERADO: El área de la circunferencia es: 28.274333882308138       || RES. OBTENIDO: El área de la circunferencia es: 28.274333882308138
	 *RADIO: q    || RES. ESPERADO:Error, introduce un número (vuelve a preguntar) || RES. OBTENIDO: Error, introduce un número (vuelve a preguntar)
	 *OPC. MENU: q || RES. ESPERADO:Error, introduce un número (vuelve a preguntar) || RES. OBTENIDO: Error, introduce un número (vuelve a preguntar)
	 */
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Var
		Circulo circulo;
		// guarda el rádio del circulo y el resultado de las operaciones
		double radio, resultado = 0;
		// guarda la opción del menú del usuario
		int opc;
		// pide el rádio del círculo
		radio = pideRadio();
		// muestra el menú y recoge la opción introducida
		opc = menu();

		circulo = new Circulo(radio);
		// devuelve el resultado según la opcion del mnú introducida
		while (opc != 0) {
			switch (opc) {
			case 1 -> {
				resultado = circulo.circunferencia();
				System.out.println("El perímetro de la circunferencia es: " + resultado + "\n");
			}
			case 2 -> {
				resultado = circulo.area();
				System.out.println("El área de la circunferencia es: " + resultado + "\n");
			}
			}
			// vuelve a mostrar el menú para volver a recoger otra opción de este
			opc = menu();
		}
		// mensaje de finalización del programa
		System.out.println("FIN");

	}

	// muestra un menú y recoge la opción introducida, además comprueba que sea
	// válido
	public static int menu() {
		int opc = -1;
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
				sc.nextLine();
			}
		} while (opc < 0 || opc > 2);
		return opc;
	}

	// pide el rádio de la circunferencia y comprueba que el valor sea válido
	public static double pideRadio() {
		double radio = -1;
		do {
			try {
				System.out.println("Introduce el radio: ");
				radio = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error. Introduce un número.");
			} finally {
				sc.nextLine();
			}
		} while (radio < 1);
		return radio;

	}

}
