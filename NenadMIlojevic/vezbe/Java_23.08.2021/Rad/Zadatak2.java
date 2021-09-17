package Java1;
import java.util.Scanner; 
public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ZADATAK 2
//	     Napraviti program za logovanje.
//	     U programu prethodno definisati proizvoljno username i password vrednost.
//	     Potrebno omoguciti da korisnik unese svoj username i password.
//	     Ispitati username i password i u slucaju neslaganja sa predefinisanim vrednostima
//	     ispisati da li je greska na passwordu ili na usernamu.
//	     Takodje omoguciti da korisnika nakon 3 pogresna unosa vise ne moze unositi i da
//	     dobija obavestenje da je blokiran.
		Scanner skener = new Scanner(System.in);
		
		int brojacKrugova=0;
		String korisnickoIme = "NekoIme"; 
		String lozinka = "Neka123" ;
		do {
			System.out.println("unesite korisnicko ime: " );
			String unetoKorIme = skener.nextLine();
			System.out.println("unesite lozinku ");
			String unetaLozinka = skener.nextLine();
			if (!(korisnickoIme.equals(unetoKorIme))){
				System.out.println("Pogresili ste korisnicko ime ");}
				
			if(!(lozinka.equals(unetaLozinka))) {
				
				System.out.println("uneli ste pogresnu lozinku ");

			}	

			if(lozinka.equals(unetaLozinka)&& korisnickoIme.equals(unetoKorIme)){
				System.out.println("Uspesno ste ulogovani");
				 break; }
				brojacKrugova =brojacKrugova +1;
				if (brojacKrugova ==3) {
			    System.out.println("tri puta ste pogresili blokirani ste:");
			    break;
				}
			
		}while(true); 
		
	}

}
