package Rad;

public class Domaci_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		-Napisati program gde u nizu napisete 5 gradova, a program vam odstampa sve osim prvog i poslednjeg unosa.
//		-Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London, Helsinki, Prag i Madrid) a program
//		stampa gradove sve dok ne dodje do "Prag"-a
//		Dva zadatka koje mozete pisati u istoj klasi ako zelite,
//		kratki su zadaci ali bitno je samo da se napise preko niza
//		
//		
		String gradovi[] = {"Beograd", "Bec", "Rim", "Bosoton", "Novi Sad"};
		
	 for(int i = 0; i<5; i++) {
		if (!(i==0 || i == (gradovi.length-1))) {
			
			 System.out.println("Gradovi "+ gradovi[i]);
		}
		
	 }
		
	  String gradovi1[] = {"Lisabon", "London", "Helsinki", "Prag", "Madrid"};
	  
	  	for(String odNizaString : gradovi1) {
	  		if (odNizaString=="Prag") {
	  			
	  			break;
	  		}
	  		System.out.println("gradovi1: " +odNizaString);
	  		
	  	}
	  
	}

}
