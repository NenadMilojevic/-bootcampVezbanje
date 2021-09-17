package cetvrtak;
import java.util.Scanner; 
public class ForPetljaZadarak1 {

	public static void main (String[] args) {
		
		// TODO Izracunati sumu prvih n brojeva
		
		Scanner skener = new Scanner(System.in);
		
		System.out.println("Unesite broj : " );
		int broj = skener.nextInt();
		int zbir = 0; 
		for(int i = 0; broj>=i; i++) {
			zbir = zbir + i;
			System.out.println("  i = " + i + "    zbir je = " + zbir);
			
			
		}
		
	}
}
