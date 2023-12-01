package ejercicio01;

public class Operaciones {

	double n1, n2;

	public Operaciones() {
	
	}

	public Operaciones(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	//suma
	public double suma() {
		return n1 + n2;
	}
	//Resta
	public double resta() {
		return n1 - n2;
	}
	//maultiplicación
	public double multiplicacion() {
		return n1 * n2;
	}
	//división
	public double div() {
		return (double) n1 / n2;
	}

	public double max() {
		return (n1 > n2) ? n1 : n2;
	}

	public double min() {
		
			return (n1 < n2) ? n1 : n2;
		}
	}

