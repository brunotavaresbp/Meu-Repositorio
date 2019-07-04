package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, triangulo, ciculo, trapezio, quadrado, retangulo;

		System.out.println("Insira os Valores:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		triangulo = a * c / 2.0;
		ciculo = 3.14159 * c * c;
		trapezio = (a + b) / 2.0 * c;
		quadrado = b * b;
		retangulo = a * b;

		System.out.printf("Trianqulo: %.3f%n", triangulo);
		System.out.printf("Circulo: %.3f%n", ciculo);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Quadrado:  %.3f%n", quadrado);
		System.out.printf("Retangulo: %.3f%n", retangulo);

		sc.close();
	}

}
