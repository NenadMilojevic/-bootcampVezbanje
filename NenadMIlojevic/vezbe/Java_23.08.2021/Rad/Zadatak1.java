package Java1;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ZADATAK 1
//	     Napisati program koji racuna prosecnu visinu kosarkaskog tima.
//	     Korisnik na standardni ulaz unosi visinu svih pet igraca
//	     kosarkskog tima.
//	     Visina je izrazena u metrima.
//	     Po zavrsetku unosa ispisuje se prosecna visina clana ekipe, visina
//	     najviseg igraca, visina najnizeg igraca.
		System.out.println("unestite visinu igraca u metrima");
		double maxVisina = 0;
		double minVisina = Double.MAX_VALUE;
		double ukupnaVisina = 0;
		Scanner skener = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			double unetaVisina = skener.nextDouble();
			if (unetaVisina < minVisina) {
				minVisina = unetaVisina;

			}
			if (unetaVisina > maxVisina) {
				maxVisina = unetaVisina;

			}
			ukupnaVisina = ukupnaVisina + unetaVisina;

		}
		System.out.println("Ukupna visina je: " + ukupnaVisina + " maksimalna visina je: " + maxVisina
				+ " minimalna visina " + minVisina + " prosek je " + ukupnaVisina / 5);

	}

}
