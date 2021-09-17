package Kola;

public class Automobil {

//	Atributi su marka, model, pogon, broj vrata i godiste.
//	
	public String markaAutomobila;
	public String modelAutomobila;
	public String pogonAutomobila;
	public int brojVrata;
	public int godisteAutomobila;
	private int predjeniKM;
	public int potrosnjaGoriva;
	private int kubikaza;
	private int potrosenoUkupno; 
	public Automobil() {

	}

	public Automobil(String marka, String model, String pogon, int vrata, int godiste, int predjeniKM, int kub) {
		this.markaAutomobila = marka;
		this.modelAutomobila = model;
		this.pogonAutomobila = pogon;
		this.brojVrata = vrata;
		this.godisteAutomobila = godiste;
		this.predjeniKM = predjeniKM;
		this.kubikaza = kub;
		
		
	}

	public void stampanje() {
		System.out.println("Marka = " + markaAutomobila + "\nmodel: " + modelAutomobila + "\npogon = " + pogonAutomobila
				+ "\nbroj vrata = " + brojVrata + "\ngodiste = " + godisteAutomobila + " predjeni km " + getpredjeniKM()
				+ "\nKubikaza je = " + getKubikaza() + "\npotrosnja je: " + getpotrosnjaGoriva() 
				+ "\nUkupno na gorivo potroseno: "  + getpotrosenoUkupno());
	}

	public void setpredjeniKm(int km) {

		this.predjeniKM = km;
	}

	public int getpredjeniKM() {

		return this.predjeniKM;
	}

	public void setKubikaza(int kub) {

		this.kubikaza = kub;
	}

	public int getKubikaza() {

		return this.kubikaza;
	}

	public void setpotrosnjagoriva(int potrosnja) {

	}

	public int getpotrosnjaGoriva() {

		if (this.kubikaza < 1000) {
			this.potrosnjaGoriva = 8;
		}
		if (this.kubikaza > 1000) {
			this.potrosnjaGoriva = 10;
		}
		return potrosnjaGoriva;
	}
	public int getpotrosenoUkupno() 
	{
		 
		this.potrosenoUkupno = ((this.predjeniKM / 100) * (this.potrosnjaGoriva * 120));	
		return potrosenoUkupno;
	}
	public void setpotrosenoUkupno()
	{
		this.potrosenoUkupno = ((this.predjeniKM / 100) * (this.potrosnjaGoriva * 120));	
		
		
	}
}
