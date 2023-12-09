package ejercicio03;

public class Circulo {
	
	double radio;
	
	public Circulo() {

	}

	public Circulo(double radio) {

		this.radio = radio;
	}
	//cálculo del perímetro de la circunferencia
	public double circunferencia() {
		
		return 2 * Math.PI * radio;
	}
	//cálculo del área de la circunferencia
	public double area() {
	
		return Math.PI * Math.pow(radio,2);
	}
}
