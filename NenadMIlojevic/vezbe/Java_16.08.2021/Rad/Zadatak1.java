package PetljaWhile;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

//		TODO ZADATAK
//		   Napraviti program sa while petljom koja ispisuje
//		    'Da li zelite da izadjete iz petlje [d/n]: '
//		     d-da, n -ne
//		     Ukoliko izaberemo d, tj. 'da', tada izlazimo iz petlje
//		     Ukoliko izaberemo n, tj. 'ne', tada ostajemo u petlji i ponavljamo pitanje
//		
//		

		Scanner skener = new Scanner(System.in);

		String izlazakIzPetlje = "ne"; // mora da se dodeli neka pocetna vrednost

		while (!izlazakIzPetlje.equals("da")) {

			System.out.println("Da li zelite da izadjete iz petlje? da/ne  ");
			izlazakIzPetlje = skener.nextLine();

		}

		System.out.println("izasli ste iz petlje");

		skener.close();

	}
}
