	package Primeri;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ZADATAK
//		Napraviti program koji od korisnika zahteva da unese dva broja koja ce sabrati
//		i ispisati rezultat korisniku. Takodje nakon ispisa rezultata ponuditi korisniku da ponovi
//		unos sa novim brojevima ili da izadje iz aplikacije. (edite
		String pitanje = "da";
		int a = 0;
		int b = 0;
		Scanner skener = new Scanner(System.in);
		Scanner skener1 = new Scanner(System.in);
		do {
			System.out.println("uneiste zeljene brojeve: ");
			a = skener.nextInt();
			b = skener.nextInt();
			int zbir = a + b;
			System.out.println("zbir je: " + zbir);
			System.out.println("da li zelite da ponovite proces da / ne");
			pitanje = skener1.nextLine();
		} while(pitanje.equals("da"));
		skener.close();
		System.out.println("kraj programa");
	}

}
