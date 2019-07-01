package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int func,recebe;
		double salario,horas;
		 func = sc.nextInt();
		 recebe = sc.nextInt();
		 horas = sc.nextDouble();
		 salario = horas*recebe;
		 System.out.printf("Numero de funcionarios: %d %nSalario: %.2f", func,salario);
		
		
		sc.close();
	}

}
