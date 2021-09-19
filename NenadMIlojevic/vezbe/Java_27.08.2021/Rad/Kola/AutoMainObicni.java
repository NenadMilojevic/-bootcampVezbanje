package Kola;

public class AutoMainObicni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napraviti klasu automobil i dve main klase gde ce se u jednoj stampati podaci preko praznog konstruktora,
//		a u drugom preko punog konstruktora. Atributi su marka, model, pogon, broj vrata i godiste.
		
		Automobil autic = new Automobil();
		autic.markaAutomobila = "BMW";
		autic.modelAutomobila = "kupe";
		autic.pogonAutomobila = "benzin";
		autic.brojVrata = 3; 
		autic.godisteAutomobila = 2015;
		autic.setpredjeniKm(2232);
		autic.stampanje();
	}

}
