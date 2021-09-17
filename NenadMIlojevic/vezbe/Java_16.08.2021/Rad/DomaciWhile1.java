package PetljaWhile;

import java.util.Scanner;

public class DomaciWhile1 {

	public static void main(String[] args) {

//	TODO 	While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, 
//		    i ispisuje njihov zbir (zbir pozitivnih brojeva).
//		    primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
//		
//		
		Scanner skener = new Scanner(System.in);

		System.out.println("unesite zeljene brojeve, " + "\nposle prvog negativnog dobicete zbir pozivitivnih");

		int broj = 0;
		int zbir = 0;

		while (broj >= 0) {

			broj = skener.nextInt();
			if (broj < 0) {
				break;
			}

			zbir = zbir + broj;

		}
		System.out.println("zbir je: " + zbir);

	}

}
