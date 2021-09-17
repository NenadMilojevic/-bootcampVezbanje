package Domaci;

import java.util.Scanner;

public class Domaci_1 {

	public static void main(String[] args) {

//		TODO -Napisati program gde korisnik unosi pozitivne brojeve, kad unese negativan broj
//		prikaze mu se suma svih prethodno unetih brojeva
//		i na kraju zakomentarisati koje ste brojeve sve unosili po testu
//		na primer:
//			//test 1 x, y, z
//			//test 2 x, y, z
//			//test 3 x, y, z
//			(Koristiti do while petlju)

		Scanner skener = new Scanner(System.in);
		double negativan = 0;
		double zbir = 0;
		do {
			System.out.println(" Unesite vas broj : ");
			negativan = skener.nextDouble();
			if (negativan < 0) {
				break;}
			zbir = zbir + negativan;
		} while (negativan >= 0);

		System.out.println("uneli ste negativan broj, " + "zbir Vasih brojeva je: " + zbir);

	}
}
/*  test 1  brojevi: 0, 1, -1 granicne vrednosti 
 *  test 2  brojevi: -1  prva negativna vrednost  
 * 	test 3  brojevi: 1234, 123435, 2324, 123435 , 232342 smoke test
 * 
 * */
