package figuras;

public class Circulo extends FiguraGeometrica{

	public Circulo(String nombreAsignado) {
		super(nombreAsignado);
	}

	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
		calcularArea();
		calcularPerimetro();
	}
	
	private void calcularArea() {
		setArea(Math.PI * radio * radio);
	}
	private void calcularPerimetro() {
		setPerimetro(2.0 * Math.PI * radio);
	}

}
