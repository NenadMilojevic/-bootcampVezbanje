package PetljaWhile;
import java.util.Scanner; 
public class DomaciWhile2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” 
//		onoliko puta koliko je korisnik zadao preko konzole.
//		Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta  (edited) 
//		
		System.out.println("Unesite broj: ");
		
		Scanner skener = new Scanner(System.in);
		
		int brojLakuNoc = skener.nextInt();
		
		while( brojLakuNoc >0) {
			
			System.out.println("Laku noc");
			brojLakuNoc--;
		}
		
		
	
		

	}

}
