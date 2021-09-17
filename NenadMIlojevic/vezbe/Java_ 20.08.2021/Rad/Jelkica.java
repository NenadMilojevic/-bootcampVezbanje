package Vezbanje;

public class Jelkica {

	public static void main (String[] args) {
		
		for(int i=0; i<5; i++) {
			
			for(int a=5;a>i; a--) {
				System.out.print("_");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			for(int j=0; j<i+1; j++)
			{
				System.out.print("*");
			}
			
			
			
		System.out.println("");	
			
		}
		
		
		
	}
}
