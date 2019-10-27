package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyCalculator;

public class Program7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("What is the dollar price? ");
		double preco = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double quant = sc.nextDouble();
		
		double total = CurrencyCalculator.ValorDolaresIOF(preco, quant);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", total);
		
		sc.close();

	}

}
