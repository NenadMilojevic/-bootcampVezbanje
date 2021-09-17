package Rad;
import java.util.Scanner; 
public class Domaci_3 {
//	 TODO -Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik preko skenera.
//	(Koristiti for petlju)
//	Na primer N: 5
//	*
//	**
//	***
//	****
//	*****
	public static void main(String[] args) {
		Scanner skener = new Scanner(System.in);
		
		int broj = skener.nextInt();
		
		for(int i=0; i<broj; i++) {
			System.out.println("");
			for(int j = 0; i>=j;j++)
			{System.out.print("*");}
		}
	
	}
	
	
}
