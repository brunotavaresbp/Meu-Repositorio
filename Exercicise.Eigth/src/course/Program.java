package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name: ");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house: ");
		int bedrom = sc.nextInt();
		System.out.println("Enter product Prince:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height:");
		String lname = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();

		System.out.println(name);
		System.out.println(bedrom);
		System.out.printf("%.2f%n",price);
		System.out.println(lname);
		System.out.println(age);
		System.out.printf("%.2f%n",height);

		sc.close();
	}

}
