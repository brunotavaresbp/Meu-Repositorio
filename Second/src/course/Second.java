package course;

public class Second {

	public static void main(String[] args) {
		
		String name = "Maria Green";
		Object obj1= "Alex Brown";
		Object obj2 = 4.5f;
		
		System.out.println(name);
		System.out.println(obj1);
		System.out.println(obj2);
		
		byte n1 = 127; //variavel byte só aceita de valor entre -128 até 127
		boolean  completed =  false;
		char gender = 'F'; //Para declarar valor na variavel 'Char' é preciso usar variavel simples " ' "
		char letter = '\u0041'; //pode declarar valor na variavel char por unicode.
		int n2 = 1000;
		int n3 = 2147483647;
		long n4 = 2147483648L; //Para o Java reconhecer que a variavel é "Long" é preciso colocar o sufixo "L" no final da variavel
		float n5 = 4.5f;
		double n6 = 4.5;
		
		System.out.println(completed);
		System.out.println(n1);
		System.out.println(gender);
		System.out.println(n2);
		System.out.println(letter);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		
	}

}
