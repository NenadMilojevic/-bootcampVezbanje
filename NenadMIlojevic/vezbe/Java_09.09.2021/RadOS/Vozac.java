package Domaci1;

public class Vozac extends Covek {

	private String zanimanje;

	public Vozac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vozac(String ime, String prezime, String zanimanje) {
		super(ime, prezime);
		// TODO Auto-generated constructor stub
		this.zanimanje = zanimanje;
	}

	@Override
	public String toString() {
		return "Vozacevo zanimanje=" + zanimanje + ", Ime je: " + getImeCovek() + ", Prezime je: "
				+ getPrezimeCovek();
	}
	
	
	
	
	
}
