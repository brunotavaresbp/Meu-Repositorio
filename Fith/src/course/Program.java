package course;

public class Program {

	public static void main(String[] args) {

		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4) * 2;
		int n3 = 17 % 3;
		double n4 = (double) 10 / 8; // posso usar 10.0 para indicar que � uma divisao de valores quebrados
		
		double a = 1.0,b = -3.0, c =-4.0;
		double x1= (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a); //formula de baskara
		
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(x1);
	}

}
