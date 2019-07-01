package course;

public class Program {

	public static void main(String[] args) {
		
		int a,b;
		double c;
		float d;
		double result;
		String s = "33";
		
		a = Integer.parseInt(s);
		result = Double.parseDouble(s);
		
		System.out.println(a);
		System.out.println(result);
		
		c = 5.0;
		d = (float) a; // Se eu quiser converter um valor maior para um menor, eu preciso indicar entre parenteses.
		
		System.out.println(d);

	}

}
