package ZadatakPlataKredit;

public class Korisnik {

	public int jmbg;
	public String imeKorisnik;
	public String prezimeKorisnik;
	public int brojDece;
	public int stepenStrucneSpreme;
	public double radniStaz;
	public double koef;
	public double plata;
	public double minuliRad;
	public int brDana;
	public boolean kredit;

//	 Minuli rad je 0.05 ako je radni staz ispod 10 godina,
	// 0.75 ako je ispod 20 godina, 1 ako je preko 20 godina.
	
	public Korisnik() {
		//prazni konsturktor
	}
	public Korisnik(int jmbg, String ime, String prezime, int stepenStrucne, double staz,int brojDece) {
		this.jmbg = jmbg; 
		this.imeKorisnik = ime;
		this.prezimeKorisnik = prezime; 
		this.stepenStrucneSpreme =  stepenStrucne; 
		this.radniStaz =  staz; 
		this.brojDece = brojDece;
		
	}
	public void stampanje() {
		
		
	
		System.out.println("  Ime korisnika je: " + this.imeKorisnik + 
				"\n  Prezime korisnika je: " + this.prezimeKorisnik + 
				"\n  radni sataz je : " + this.radniStaz+
				"\n koeficijent je : " + this.koef +
				"\n  minuli rad je: "  +  this.minuliRad + 
				
				"\n stepen strucne je:  "  + this.stepenStrucneSpreme +
				
				
				"\n  Plata korisnika je: " + plata() + "\n  Kredit je odobren: "
				+kredit() + "\n Broj slobodnih dana je: " + brojSlobodnihDana() );
		
		
	}
	
	public double koeficijent() {

		switch (this.stepenStrucneSpreme) {
		case 1: {
			this.koef = 1.03;
			break;
			}
			
		case 2: {
			this.koef = 1.65;
			break;
		}
			
		case 3: {
			this.koef = 2;
			break;
		}
			
		case 4: {
			this.koef = 2.27;
			break;
		}
			
		case 5: {
			this.koef = 2.88;
			break;
		}
			
		case 6: {
			this.koef = 3.09;
			break;
		}
			
		case 7: {
			this.koef = 3.40;
			break;
		}
			
		case 8: {
			this.koef = 4.12;
			break;
		}
			
		}
    return this.koef;
	}

	public double minuliRad() {
		if (this.radniStaz < 10) {
			this.minuliRad = 0.05;
		} else if (this.radniStaz < 20) {
			this.minuliRad = 0.75;
		} else if (this.radniStaz > 20) {
			this.minuliRad = 1;
		}
		return this.minuliRad;
	}

	public double plata() {
		double  Rad =this.minuliRad();
		double koef = this.koeficijent(); 
		this.plata = (Rad + koef) * 10000 + 2500;
		return this.plata;
	}

	public boolean kredit() {
		
		if (plata() > 50000) {
			this.kredit = true;
		} else {
			this.kredit = false;
		}
		return this.kredit;

	}

	public int brojSlobodnihDana() {
		this.brDana = 22; 
		if (this.brojDece !=0) {
			this.brDana = this.brDana  + (this.brojDece *2);
		}
		return this.brDana;
	}

}
