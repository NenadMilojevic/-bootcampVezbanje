package Rad;
import java.util.Scanner; 
public class niz_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napravi meni za kafic, cene nek buduu definisane, uneti kolicinu, stampa racun
//		
//		
//		Napraviti meni	
//		1. Pivo
//		2. Vinjak
//		3. Koktel
//		
//		Nakon odabira pica, sledi pitanje za kolicinu
//		
//		Kad korisnik upise kolicinu, ispisite ukupnu cenu
//		
//		(cene artikala stavite kao promenljive u programu i dodelite im neke vrednosti
		Scanner skener = new Scanner(System.in);
		int pivo = 120; 
		int vinjak = 100; 
		int koktel = 400; 
		int odabirPica; 
		int kolicina; 
		String kolicinaIspis ="Unesite zeljenu kolicinu "; 
		System.out.println("odaberite zeljeno pice \n Pivo: " + pivo + "\n vinjak: " + vinjak + "\n koktel: " + koktel  );
		
		odabirPica = skener.nextInt();
		
		
		switch(odabirPica) {
		
		case 1: 
		{
			System.out.println(kolicinaIspis);
			kolicina = skener.nextInt();
			System.out.println(" vas racun je " + kolicina * pivo);
		}break;
		case 2:{
			
			System.out.println(kolicinaIspis);
			kolicina = skener.nextInt();
			System.out.println(" vas racun je " + kolicina * vinjak);
		}break; 
		case 3: {
			
			System.out.println(kolicinaIspis);
			kolicina = skener.nextInt();
			System.out.println(" vas racun je " + kolicina * koktel );
			
		}break; 
		
		default:{
			
			System.out.println("izabrali ste pogresan unos");
		}
		
		}
		
		

	}

}
