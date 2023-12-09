package ejercicio02;

public class Rectangulo {

	double ancho, alto;
	
	public Rectangulo() {
		
	}
	
	public Rectangulo (double ancho, double alto) {
		
		this.ancho = ancho;
		this.alto = alto;
	}
	//cálculo de perímetro
	public double perimetro() {
		return (ancho * 2 + alto * 2);
	}
	//cálculo del área
	public double area() {
		return ancho * alto;
	}
	
	
}
