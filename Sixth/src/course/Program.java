package course;

public class Program {

	public static void main(String[] args) {
		
		double n1 = 10;
		double n2 = 30;
		String s ="ABC";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		System.out.println("-------------------------------------");
		
		n1 *= 2; //Estou fazendo com que a variavel n1 seja multiplicada por 2 sempre
		n2 += n1; 
		s +="DEF";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("-----------------------------------------");
		 int a = 10;
		 int b = ++a; // Quando eu faço isso, a variavel "b" vai receber o valor de "a", dps que eu fizer isso ele vai adicionar +1, ou seja a variavel "a" passa a valer 11
		 System.out.println(a);
		 System.out.println(b); 
	}

}
