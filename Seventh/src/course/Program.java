package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in); // é necessário eu importa a biblioteca java.util para q a função scanner funcione
		
		String sentence = sc.nextLine(); 
		String x,y,z;
		x = sc.next(); //uso o comando "next" para que ele leia oq o usuario digita, é o scanf do java
		y = sc.next();
		z = sc.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x = sc.next(); //o comando "sc.next" tb serve para ler palavras na mesma linha
		y = sc.next();
		z = sc.next();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
		
	}

}
