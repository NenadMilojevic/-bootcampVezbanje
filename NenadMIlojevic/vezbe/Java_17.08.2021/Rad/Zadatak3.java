package Primeri;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ZADATAK
//		Napraviti program za koji ce moci da unosimo brojeve pojedinacno.
//		A nakon svakog unosa proracunamo i
//		ispisemo zbir dotad unetih vrednosti.
//		Algoritam treba da radi za unos do 5 brojeva ili ako se dostigne suma preko 50.
		Scanner skener = new Scanner(System.in);
		int broj = 0;
		int zbir = 0; 
		int iterator = 0;
		
		do {
			System.out.println("unesite broj");
			broj = skener.nextInt();
			zbir +=broj; 
			System.out.println("zbir je: " + zbir);
			iterator++;
			
		} 
		while(iterator<5 && zbir<50);
	
		System.out.println("kraj programa");
		skener.close();
	}
}
