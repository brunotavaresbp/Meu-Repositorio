package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2); // Se aplica em programação de baixo nivel como por exemplo: Arduino, interface de rede
		
		System.out.println("--------------------------------");
		
		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) !=0) {
			System.out.println("6th bit is true!");
		}
		else
		{
			System.out.println("6th bit is false!");
		}
		
		sc.close();
		
		
		
		
		

	}

}
