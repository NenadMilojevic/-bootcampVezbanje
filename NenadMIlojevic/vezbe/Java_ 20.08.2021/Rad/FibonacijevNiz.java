package Vezbanje;
import java.util.Scanner;
public class FibonacijevNiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // fibonacijev niz je niz u kojem je svaki sledeci br zbir prethodna dva 
	 Scanner skener = new Scanner(System.in);
	 System.out.println("unesite zeljeni broj ");
	 int brojac = skener.nextInt();
	 int zbirMin = 0;
	 int zbirMax = 1; 
	 for(int i=0;i<brojac;i++ ) {
		int zbir = zbirMin + zbirMax;
		 zbirMin = zbirMax; 
		 
		 zbirMax = zbir;
		
		 
		 System.out.println("zbir je:" + zbirMax + "   iterator je "+i);
		 
		
		 
	 }
	
	}

	
	
}
