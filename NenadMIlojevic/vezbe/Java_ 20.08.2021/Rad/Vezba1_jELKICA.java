package Vezbanje;

import java.util.Scanner;

public class Vezba1_jELKICA {

	public static void main(String[] args) {
		// TODO napraviti jelkicu
		Scanner skener = new Scanner(System.in);
		System.out.println("Unesite zeljeni br zvezdica");
		int brojZvezdica = skener.nextInt();

		for (int i = 1; i <= brojZvezdica; i++) {

			for (int b = 5; b > i; b--) {
				System.out.print(" ");

			}
			for (int c = 0; c < i; c++) {
				System.out.print("*");

			}
			System.out.println("");
		}

		for (int i = brojZvezdica - 1; i > 0; i--) {

			for (int b = 4; b >= i; b--) {
				System.out.print(" ");

			}
			for (int c = 0; c < i; c++) {
				System.out.print("*");

			}
			System.out.println("");
		}
	}

}
