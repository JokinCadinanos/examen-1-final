package acciones;

import java.util.Scanner;

import figuras.Circulo;
import figuras.Poligono;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String seguir = "n";// No seguir por defecto

		do {

			System.out.println("Este programa crea una figura con los datos introducidos por el usuario.");
			System.out.println("Selecciona:");
			System.out.println("1. Poligono");
			System.out.println("2. Círculo");

			int opcion = teclado.nextInt();

			if (opcion == 1) {
				System.out.println("Introduce el número de lados:");
				int lados = teclado.nextInt();
				System.out.println("Introduce la longitud de cada lado:");
				double longitud = teclado.nextInt();
				Poligono poligono = new Poligono("NUEVO POLIGONO");
				poligono.setLados(lados);
				poligono.setLongitudLado(longitud);
				System.out.println("Perimetro: " + poligono.getPerimetro());
			} else if (opcion == 2) {
				System.out.println("Introduce el radio:");
				double radio = teclado.nextDouble();
				Circulo circulo = new Circulo("NUEVO CIRCULO");
				circulo.setRadio(radio);
				System.out.println("Area: " + circulo.getArea());
				System.out.println("Perimetro: " + circulo.getPerimetro());
			}
			System.out.println("Crear nueva figura? (S/N) ");
			seguir = teclado.next();
		} while (seguir.equalsIgnoreCase("s"));

	}

}
