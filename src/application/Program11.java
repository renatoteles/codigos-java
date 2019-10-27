package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent vect[] = new Rent[10];
		int n;
		
		do {
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		} while ( n < 1 || n > 10);
		
		for ( int i=1; i<=n; i++ ) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int numQuarto = sc.nextInt();
			vect[numQuarto] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for ( int i=0; i<10; i++ ) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
		
	}

}
