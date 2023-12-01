package ejercicio04;

public class Cilindro {

	double h, r;

	
	
	public Cilindro() {
	}

	public Cilindro(double h, double r) {
		this.h = h;
		this.r = r;
	}
	public double volumen() {
		
		return Math.PI * Math.pow(r, 2) * h; 
		
	}
	public double area() {
		
		return (2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2));
		
	}
	
	
	
}
