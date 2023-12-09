package ejercicio01;

public class Operaciones {

	double numero1, numero2;

	public Operaciones() {
	
	}

	public Operaciones(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	//suma
	public double suma() {
		return numero1 + numero2;
	}
	//Resta
	public double resta() {
		return numero1 - numero2;
	}
	//maultiplicación
	public double multiplicacion() {
		return numero1 * numero2;
	}
	//división
	public double div() {
		
		return (double) numero1 / numero2;
	}
	//número máximo
	public double max() {
		return (numero1 > numero2) ? numero1 : numero2;
	}
	//número mínimo
	public double min() {
		
			return (numero1 < numero2) ? numero1 : numero2;
		}
	}

