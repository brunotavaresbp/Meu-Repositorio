package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o valor da area:");
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = (raio * raio) * pi;
		System.out.printf("A = %.4f", area);

		sc.close();
	}

}
