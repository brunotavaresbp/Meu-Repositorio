package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("Even!");
		} else {
			System.out.println("False");
		}
		
		System.out.println("What time is is?");
		int time = sc.nextInt();
		if(time < 12) {
			System.out.println("Bomd dia!");
		}
		else if (time < 18) {
			System.out.println("Boa Tarde!");
		}
		
		else {
			System.out.println("Boa Noite!");
		}
		
		
		sc.close();
	}

}
