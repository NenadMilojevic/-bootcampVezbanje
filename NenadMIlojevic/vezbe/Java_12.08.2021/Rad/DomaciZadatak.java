//package primer_01;
//
//import java.util.Scanner;
//
//public class DomaciZadatak {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		 program gde deklarisete vase ime, prezime kao string, pol kao char 
////		i odstampajte adekvatno sva tri unosa. Nakon toga preko skenera treba da unesete ukupan broj medalja 
////		koliko je Srbija osvojila na olimpijskim igrama i ukupan broj zlatnih medalja koliko je Srbija osvojila na olimpijskim igrama, 
////		na kraju treba odstampati procenat zlatnih medalja u odnosu na ukupan broj medalja. Ako ima pitanja pisite u thread.
////		
////		
//	   String imePrezime ="Nenad, Milojevic";
//	   char pol = 'm';
//	   
//	   System.out.println(imePrezime + " pol : " + pol);
//	   
//		Scanner skener = new Scanner(System.in);
//		
////		System.out.println("Unesite Vase ime: ");
////		String ime = skener.nextLine();
////		
////		System.out.println("Unesite Vase prezime ");
////		String prezime = skener.nextLine();
////		
////		System.out.println("Unesite Vas pol u formi jednog slova ");
////		char pol = skener.next(). charAt(0); 
////		
////		System.out.println("Vase ime je: " + ime +
////				"\nVase prezime je: " + prezime +
////				"\nVas pol je: " + pol );
//		
//		System.out.println("unesite ukupan broj osvojenih medalja Srbije na OI ");
//		int ukupnoMedalja =  skener.nextInt();
//		
//		System.out.println("unesite ukupan broj osvojenih zlatnih medalja Srbije na OI ");
//		int zlatneMedalje = skener.nextInt();
//		
//		int procenatZlatnih = (zlatneMedalje*100)/ukupnoMedalja;
//        System.out.println("Procenat zlatnih je: " + procenatZlatnih + "%"  + 
//		
//        		" u odnosu na ukupno osvojenih: " + ukupnoMedalja);
//		
//		
//		
//		skener.close();
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}
package primer_01;

import java.util.Scanner;

public class DomaciZadatak {

	public static void main(String[] args) {
	
	   String ime ="Nenad";
	   String prezime = "Milojevic";

	   char pol = 'm';
	   
	   System.out.println("Ime: " + ime + "\nprezime: "+prezime+ "\nPol je:"+ " pol : " + pol);
	   
		Scanner skener = new Scanner(System.in);
		

		System.out.println("unesite ukupan broj osvojenih medalja Srbije na OI ");
		int ukupnoMedalja =  skener.nextInt();
		
		System.out.println("unesite ukupan broj osvojenih zlatnih medalja Srbije na OI ");
		int zlatneMedalje = skener.nextInt();
		
		int procenatZlatnih = (zlatneMedalje*100)/ukupnoMedalja;
        System.out.println("Procenat zlatnih je: " + procenatZlatnih + "%"  + 
		
        		" u odnosu na ukupno osvojenih: " + ukupnoMedalja);
		
		
		
		skener.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
