package ejercicio04;

public class Cilindro {

	double altura, radioBase;

	
	
	public Cilindro() {
	}

	public Cilindro(double altura, double radioBase) {
		this.altura = altura;
		this.radioBase = radioBase;
	}
	//calcula el volumen del cilindro
	public double volumen() {
		
		return Math.PI * Math.pow(radioBase, 2) * altura; 
		
	}
	//calcula el área del cilindro
	public double area() {
		
		return (2 * Math.PI * radioBase * altura) + (2 * Math.PI * Math.pow(radioBase, 2));
		
	}
	
	
	
}
