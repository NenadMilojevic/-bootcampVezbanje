package Domaci1;

public class Putnik extends Covek {

	private int novac;
	
	public void dodatiNovac(int dodatak) {
	this.novac +=dodatak; 	
		
		
	}
	
	public void oduzetiNovac(int oduzimanjeNovca) {
		if(this.novac >= oduzimanjeNovca) {
			this.novac -= oduzimanjeNovca;
		}
		
		
	}
	
	public int getNovac() {
		return novac;
	}

	public void setNovac(int novac) {
		this.novac = novac;
		
	}

	public Putnik() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Putnik(String ime, String prezime,int novac) {
		super(ime, prezime);
		this.novac= novac;
	
	}

	@Override
	public String toString() {
		return "Putnik ima: " + this.novac + " dinara, Ime je:  " + getImeCovek() + ", Prezime je: "
				+ getPrezimeCovek();
	} 
	
	
}
