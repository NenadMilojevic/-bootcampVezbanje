package PetljaWhile;
import java.util.Scanner;
public class TomasovPrimer {

	public static void main (String[] args) {
		
		
		
		
		Scanner skener = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj: ");
		
		
		
		System.out.println("Unesite drugi broj: ");
		
		int brojMax = skener.nextInt();
	    int brojMin = skener.nextInt();
	    
	    if (brojMin > brojMax) {
	    	
	    	int temp = brojMin; 
	    	brojMin =brojMax; 
	    	brojMax = temp;
	    	
	    }
	    
		int iterator = brojMin; 
		int zbir = 0; 
		
		while ( iterator < brojMax ) {
			
			zbir = zbir + iterator; 
			
			System.out.println("iterator = " + iterator + " ,zbir = " + zbir );
			iterator ++;
			
			
			
		}
		System.out.println("zbir je = " + zbir);
		
		
		
		
		
	}

}
