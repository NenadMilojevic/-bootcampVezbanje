package Primeri;

import java.util.Scanner;

public class Primer1WhileDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ZADATAK
//		Napraviti program koji omogucava unos proizvoljnog broja.
//		Nakon unosa ispisati sve parne brojeve od 0 do vrednosti unetog broja.
//		
		Scanner skener = new Scanner(System.in);

		int i = 0;
		int unetiBr = skener.nextInt();

		do {
			System.out.println("Brojevi su = " + i);
			
			if(unetiBr>0)
			{ i+=2;  }
			
			else
			{ i-=2;  };
			 

		}

		while (i != unetiBr);

		System.out.println("kraj programa");
	}

}
