package application;

import java.util.Locale;
import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; i<mat[i].length; i++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Main diagonal: ");
		for (int i=0; i<mat.length; i++) {
			System.out.printf(mat[i][i] + " ");
		}
		
		System.out.println();
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; i<mat[i].length; i++) {
				if (mat[i][j] < 0){
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);
		
		sc.close();
	}

}
