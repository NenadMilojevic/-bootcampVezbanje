package NoviPaket;

import java.util.Scanner;

public class DomaciIFJedan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		-Napisati program gde preko skenera unesete broj, ako je broj manji od 10 onda ga pomnoziti sa 100,
//		ako je broj veci od 100 onda ga podeliti sa 10.
//		Na kraju zakomentarisite koje brojeve ste koristili za proveru programa.

		Scanner skener = new Scanner(System.in);
		
		System.out.println("Unesite broj:");
		double broj = skener.nextDouble();
		
		skener.close();
		 
		if(broj<10) {
			double brManji= broj *100;
			System.out.println("vas broj je:  "+ broj +  "\npomnozen sa 100 = " + brManji);
		}
		else if(broj>100) { 
			double brVeci = broj/10;
			System.out.println("Vas broj je: " + broj + "\npodeljen sa 100 = "+ brVeci);
			
		}
		
//      brojevi 10 i 100 koji nisu u scope-u  
//		brojevi 10 i 100  granicne vrednosti 9,11, 99, 101
//      onda 0 i negativni brojevi -1. -10 i -100
		
	}

}
