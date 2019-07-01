package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Eu preciso colocar antes do scanner para ele interpretar tudo em ponto
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt(); 
		sc.nextLine();
		String name = sc.nextLine(); //o comando "next.line" funciona até a quebra de linha, porém como eu dei "Enter" na linha anterior para ele ler o valor, ele termina o programa
		// e eu nao consigo continuar o nextLine, para eu evitar isso eu preciso chamar um next.Line vazio na linha anterior. Exemplo na linha: 12 do comando abaixo
		char gender = sc.next().charAt(0);
		//b5
		String s = sc.next();
		char letter = s.charAt(0); // peguei o caracter que está na primeira posição do meu string que é a letra "b"
		int digit = Integer.parseInt(s.substring(1)); // O comando s.substring ele recorta o meu String(b5) desde a posição que é "5" e armazena ela na variavel digit como inteiro
		// e o meu comando "Integer.parsetInt serve para eu converter o valor 5 para uma inteira, pq ele só lê em String
		
		//4.32
		double n2 = sc.nextDouble();
		// Maria F 23 1.68
		
		String name2= sc.next();
		char ch = sc.next() .charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
				
				
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		
		
		
		sc.close();

	}

}
