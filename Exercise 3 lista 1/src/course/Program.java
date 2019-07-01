package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, diferenca;
		
		System.out.println("Entre com os valores:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		diferenca = a * b - c * d;
		System.out.printf("O resultado é: %d", diferenca);

		sc.close();
	}

}
