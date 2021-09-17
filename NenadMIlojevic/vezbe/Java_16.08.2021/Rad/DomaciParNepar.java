package PetljaWhile;

import java.util.Scanner;

public class DomaciParNepar {

//	TODO
//	ZADATAK
//	2. Naci sumu parnih i sumu neparnih brojeva izmedju dva proizvoljno uneta broja
//	
	public static void main(String[] args) {

		Scanner skener = new Scanner(System.in);

		System.out.println(" Unesite dva zeljena broja: ");

		int brojMin = skener.nextInt();
		int brojMax = skener.nextInt();
		int zbirP = 0;
		int zbirN = 0;
		if (brojMax == brojMin) {
			System.out.println("Brojevi su jednaki");

		} else {

			if (brojMin > brojMax) {
				int zamena = brojMin;
				brojMin = brojMax;
				brojMax = zamena;
			}
			System.out.println(" Veci br je = " + brojMax + "\n Manji br je = " + brojMin);
			
			
			while (brojMax>=brojMin) {
				if( brojMin % 2 ==0 ) {
					zbirP = zbirP + brojMin;
					
				}else if (brojMin % 2==1 ){
					
				zbirN = zbirN + brojMin;
				} 
				
				brojMin++;
				
				System.out.println(" Zbir parnih je: " + zbirP + " \n Zbir neparnih je: " + zbirN );
				System.out.println("brojMin / iterator je: " + brojMin);
				
				
				
				
				
			}
			
		}

	}

}
