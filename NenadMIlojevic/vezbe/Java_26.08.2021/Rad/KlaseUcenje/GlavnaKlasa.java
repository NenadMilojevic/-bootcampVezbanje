package KlaseUcenje;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolaznikKursa1 polaznik1 = new PolaznikKursa1 ();
		polaznik1.idPolaznika = 1; 
		polaznik1.imePolaznika = "Nenad"; 
		polaznik1.prezimePolaznika = "Milojevic";
		polaznik1.godinaRodjenja = 1986; 
		polaznik1.prosekOcena = 999; 
		
		polaznik1.StampanjePodataka();
		
		PolaznikKursa1 polaznik2 = new PolaznikKursa1 ();
		polaznik2.idPolaznika =2; 
		polaznik2.imePolaznika = "Marko"; 
		polaznik2.prezimePolaznika = "Markovic";
		polaznik2.godinaRodjenja = 1980; 
		polaznik2.prosekOcena = 1999; 
		
		polaznik2.StampanjePodataka();
		
		PolaznikKursa1 polaznik3 = new PolaznikKursa1 (2, "Petar", "Petrovic", 1984,2000 );
		polaznik3.StampanjePodataka();
		
	}

}
