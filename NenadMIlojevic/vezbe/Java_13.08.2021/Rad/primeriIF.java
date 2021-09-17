package NoviPaket;

import java.util.Scanner;

public class primeriIF {

	public static void main(String[] args ) {
		Scanner  skener = new Scanner(System.in);
		System.out.println("Unesite broj godina");
		
		int brojGodina = skener.nextInt(); 
		skener.close();
		
		if (brojGodina >= 18) {
			
			System.out.println(" Osoba je punoletna ima vise od 18 godina");
			
		}
		else {
			System.out.println("Osoba je maloletna ima manje od 18 godina");
		}
		
		
		
		
		
		System.out.println("Kraj programa");
		
		
		
	}
	
	
}
