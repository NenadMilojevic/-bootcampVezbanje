package Domaci1;

public class Covek {

	
	private String imeCovek; 
	private String prezimeCovek; 
	
	public Covek() {}
	public Covek(String ime, String prezime){
		this.imeCovek = ime; 
		this.prezimeCovek = prezime; 

	}
	
	public String getImeCovek() {
		return imeCovek;
	}
	public String getPrezimeCovek() {
		return prezimeCovek;
	}
	@Override
	public String toString() {
		return "Ime je: " + imeCovek + ", Prezime je " + prezimeCovek;
	}
	
}
