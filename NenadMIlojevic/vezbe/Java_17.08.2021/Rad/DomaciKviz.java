package Primeri;

import java.util.Scanner;

public class DomaciKviz {

	public static void main(String[] args) {

//		TODO ZADATAK
//		Napisati program koji oponasa kviz za pogadjanje glavnog grada.
//		- Program treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z programa.
//		    1. Francuska
//		    2. Italija
//		    3. Srbija
//		    4. Izlaz
//		- Nakon odabira drzave, potrebno je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?'
//		- Ako korisnik odgovori tacno, ispisuje se poruka 'Odgovor je tacan'
//		- Ako korisnik odgovori netacno, ispisuje se poruka 'Odgovor nije tacan'
//		- Nakon davanja odgovora (bilo da je tacan ili netacan), ponovo treba da se postave
//		sve pocetne opcije i ponudi korisniku da odabere neku od njih.
//		- Program se zavrsava kad korisni odabere 4. opciju 'Izlaz'
//		- Program uraditi koriscenjem dosad naucenog + do-while petlje
//		
		Scanner skener = new Scanner(System.in);
		Scanner skener1 = new Scanner(System.in);
		String pitanjeGrad = " koji je glavni grad ";
		String gradFr = "Pariz";
		String gradIt = "Rim";
		String gradSr = "Beograd";
		int fr = 1;
		int it = 2;
		int sr = 3;
		int izlaz = 0;
		String gradUnos;

		do {
			System.out.println("Odaberite drzavu:  \n    1. Francuska\r\n" + "    2. Italija\n" + "    3. Srbija\n"
					+ "    4. Izlaz");
			int birac = skener.nextInt();
			if (birac == 1) {
				System.out.println("Odabrali ste Francusku, " + pitanjeGrad);

				gradUnos = skener1.nextLine();
				if (gradUnos.equals(gradFr)) {
					System.out.println("Odgovor je tacan");
				} else {
					System.out.println("Odgovor je netacan");

				}

			}

			if (birac == 2) {
				System.out.println("Odabrali ste Francusku, " + pitanjeGrad);

				gradUnos = skener1.nextLine();
				if (gradUnos.equals(gradIt)) {
					System.out.println("Odgovor je tacan");
				} else {
					System.out.println("Odgovor je netacan");

				}

			}

			if (birac == 3) {
				System.out.println("Odabrali ste Francusku, " + pitanjeGrad);

				gradUnos = skener1.nextLine();
				if (gradUnos.equals(gradSr)) {
					System.out.println("Odgovor je tacan");
				} else {
					System.out.println("Odgovor je netacan");

				}

			}

			if (birac == 4) {
				break;
			}

		} while (izlaz != 4);

		skener.close();

		System.out.println("Kraj programa");

	}
}
