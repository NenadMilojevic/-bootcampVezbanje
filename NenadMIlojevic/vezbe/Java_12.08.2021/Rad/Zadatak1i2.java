package primer_01;

import java.util.Scanner;

public class Zadatak1i2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub na osnovu unete sranice 
		// izracunati povrsinu i obim kvadrata (na osnovu unete stranice a)
		
		 // izracunati povrsinu i obim pravougaonika (na osnovu unete stranice a i b)
			
		
		Scanner skener = new Scanner(System.in);
		System.out.println("unesite stranicu kvadrata a ");

		double a = skener.nextDouble();
		double obimA = 4* a; 
		double povrsinaA = a*a; 
		System.out.println("Obim kvadrata cija je stranica je: " + obimA + 
				" povrisna je: " + povrsinaA);
		
		System.out.println("Unesite zeljene strnice pravougaonika ");
		 
		a = skener.nextDouble(); 
		double b = skener.nextDouble(); 
		
		double obimP = 2*a + 2*b; 
		double povrsinaP = a * b;
		
		System.out.println("obim pravougaonika je: " + obimP +
				"    povrsina je: " + povrsinaP);
		
	  
			skener.close();
		
//			 double povrsinaKvadrata =
//			 Math.pow(skener.nextDouble(), skener.nextDouble());
	}

}
