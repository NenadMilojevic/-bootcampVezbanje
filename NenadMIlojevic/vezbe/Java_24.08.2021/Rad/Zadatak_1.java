package dan_1_domaci;
import java.util.Scanner;
public class Zadatak_1 {
	
	public static void main(String[] args) {
	
		//TODO Funkcije1: Napisati program koji ce procitati 3 cela broja
//		sa standardnog ulaza (znaci da korisnik unosi tri broja)
//        i taj program treba da pozove i ispise (u mainu) 
//        najmanji od ta tri unesena broja.
//		
//		
		Scanner skener = new Scanner(System.in);
		System.out.println();
		metod(skener.nextInt(), skener.nextInt(), skener.nextInt());
		
		
	}
	
       public static void metod(int pBr, int dBr, int tBr) {
    	   int min = Integer.MAX_VALUE;
    	   if(pBr<min) {
    		   min=pBr;
    	   } if(dBr<min ) {
    		   min=dBr;
    	   } if(tBr<min) {
    		   min=tBr;
    	   }
    	   System.out.println("najmanji broj je: " + min); 
    	   
    	   
    	   
    	   
//    	   if(pBr<dBr && pBr<tBr ) {
//    		   
//    		   System.out.println("Najmanji broj je " + pBr);
//    	   }
//    	   else if(dBr<pBr && dBr<tBr) {
//    		   System.out.println("Najmanji broj je: " + dBr);
//    	   }
//    	   else if(tBr<pBr && tBr<dBr) {
//    		   System.out.println("Najmanji broj je: " + tBr);
//    	   }else {
//    		   System.out.println("Brojevi su jednaki");
    		   
    		   
    	   }
    		   
       }
	

