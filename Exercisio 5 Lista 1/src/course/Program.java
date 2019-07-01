package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int p1, n1, p2, n2;
		double pr2, pr1, total, subtotal1, subtotal2;

		System.out.println("Informe o codigo,numero de peças e o valor:");
		p1 = sc.nextInt();
		n1 = sc.nextInt();
		pr1 = sc.nextDouble();
		p2 = sc.nextInt();
		n2 = sc.nextInt();
		pr2 = sc.nextDouble();
		subtotal1 = pr1 * n1;
		subtotal2 = pr2 * n2;
		total = subtotal1 + subtotal2;
		System.out.printf("Valor a pagar: %.", total);

		sc.close();

	}

}
