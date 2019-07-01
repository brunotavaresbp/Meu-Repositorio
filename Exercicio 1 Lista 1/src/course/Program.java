package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os valores de a e b:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int resultado = a+b;
		System.out.printf("Soma = %d",resultado);
		
		
		
		

		sc.close();
	}

}
