package primer_01;

import java.util.Scanner;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO sad radimo i unosenje podataka 
		// objekat koji se koristi za to je skener
		
		Scanner scanner = new Scanner(System.in );
		
		System.out.println("unesite broj: ");
		
		int a = scanner.nextInt();
		
		System.out.println("Vas broj je: " + a);
		scanner.close();
		
		
		
		
		
	}

}
