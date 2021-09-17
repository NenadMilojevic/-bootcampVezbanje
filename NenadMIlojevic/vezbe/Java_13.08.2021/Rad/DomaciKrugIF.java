package NoviPaket;

import java.util.Scanner;

public class DomaciKrugIF {
public static void main (String[] args) {

	Scanner skener = new Scanner(System.in);
	
	System.out.println("unesite poluprecnik kruga");
	
	double r = skener.nextDouble();
//	
//	if (r<=0) {
//		System.out.println("Poluprecnik nije validan ");
//	}
//	else if (r<5) {
//		System.out.println("Povrsina Vaseg kruga je: " + (r*r*3.14));
//	}
//	else if (r>=5 && r <10) {
//		System.out.println("Obim kruga je: " + (2*r*3.14));
//	}
//	else if (r>10) {
//		System.out.println("Povrsina je: " + (r*r*3.14) + "\nObim je: " + (2*r*3.14));
//	}
//	
	
if (r>0) {
	
	if(r<5) {
		System.out.println("Povrsina Vaseg kruga je: " + (r*r*3.14));
		if(r>5) {
			System.out.println("Obim kruga je: " + (2*r*3.14));
			if(r>10) {
				System.out.println("Povrsina Vaseg kruga je: " + (r*r*3.14));
			}
			}
	}
	
	
}else {
	System.out.println("poluprecnik nije validan");
}
	
}
}
//TODO Uneti poluprecnik kruga
//Ako je manji ili jednak od 0 -> vratiti poruku da poluprecnik nije validan
//Ako je poluprecnik manji ili jednak od 5 izracunati P
//Ako je poluprecnik veci od 5 izracunati 0
//Ako je poluprecnik veci od 10 izracunati P i O
//  napomena: pi=3.14    P = r*r*pi    O=2*r*pi
//  * prikazati sa ugnjezdenim if-ovima