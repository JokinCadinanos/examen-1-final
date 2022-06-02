package figuras;

public class Poligono extends FiguraGeometrica {

	// Número de lados del polígono:
	private int lados;
	// Longitud de cada lado:
	private double longitudLado;


	public Poligono(String nombreAsignado) {
		super(nombreAsignado);
	}

	public double calcularPerimetro() {
		double perimetro = 0.0;
		for (int i = 1; i <= getLados(); i++) {
			perimetro += getLongitudLado();
		}
		setPerimetro(perimetro);
		return perimetro;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
		calcularPerimetro();
	}

	public double getLongitudLado() {
		return longitudLado;
	}

	public void setLongitudLado(double longitudLado) {
		this.longitudLado = longitudLado;
		calcularPerimetro();
	}



}
