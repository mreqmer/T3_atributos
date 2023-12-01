package ejercicio03;

public class Circulo {
	
	double r;
	
	public Circulo() {

	}

	public Circulo(double r) {

		this.r = r;
	}
	
	public double circunferencia() {
		
		return 2 * Math.PI * r;
	}
	public double area() {
	
		return Math.PI * Math.pow(r,2);
	}
}
