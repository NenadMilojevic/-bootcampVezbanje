package primer_01;

import java.util.Scanner;

public class ZadatakKrug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Unestite svoje ime:
//			Unestite svoje prezime:
//			Unesite poluprecnik kruznice:
//			Obim kruga je:
//			Povrsina kruga je:
		
		
		Scanner skener = new Scanner(System.in);
		
		System.out.println("unesite vase ime:");
		
		String ime = skener.nextLine();
		
		System.out.println("unesite vase preime:");
		String prezime =skener.nextLine();
		
		
		System.out.println("Poluprecnik kruznice je:");
		
		double r =skener.nextDouble();
		
		System.out.println("Vase ime je: " + ime + "\n" + " Vase prezime je: " + prezime+ 
				"\n" + " Obim kruga je " + (2*r*Math.PI) +"\n Povrsina kruga je: "+ (r*r*Math.PI) );
		
		
		
		skener.close();
		
		
	}

}
