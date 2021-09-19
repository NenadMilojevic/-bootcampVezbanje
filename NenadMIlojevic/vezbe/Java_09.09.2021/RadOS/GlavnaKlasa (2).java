package Domaci1;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Covek covek = new Covek("Petar", "Petrovic");
		
		System.out.println(covek);
		System.out.println("================================================");
		
		Vozac vozac = new Vozac("Marko", "Markovic", "sofer e kategorije");
		System.out.println(vozac); 
		System.out.println("================================================");
		
		Putnik putnik = new Putnik("Milos", "Milosevic", 2600);
		System.out.println(putnik);
		putnik.dodatiNovac(2200);
		System.out.println(putnik);
		putnik.oduzetiNovac(1000);
		System.out.println(putnik);
		System.out.println("================================================");
				
		Autobus autobus = new Autobus("gradski 23", 150);
		System.out.println(autobus);
		autobus.napraviPutnika(putnik);
		autobus.dodajVozaca(vozac);
		System.out.println(autobus);
		autobus.ukloniPutnika(putnik);
		autobus.ukloniVozaca(vozac);
		System.out.println(autobus);
		
	}

}
