package DomaciZoo;

public class Ribe extends Vrsta {
 

private String mestoObitavanja; 
 private String vrstaPeraja; 
 private int brojPeraja;
 
 public void stampanjeRibe() {
   System.out.println("Vrsta je: " +super.getVrsta() +
			 "\nNaziv je:" + super.getNazivZivotinje() +
			 "\nHrani se: " + super.getIshrana() +
			 super.stampanjeKic() +
			 "\nMesto obitavanja: " + this.mestoObitavanja + 
			 "\nVrsta peraja: " + this.vrstaPeraja + 
			 "\nBroj peraja: " + this.brojPeraja);
 }
 
 
 
@Override
public String toString() {
	return "Ribe [mestoObitavanja=" + mestoObitavanja + ", vrstaPeraja=" + vrstaPeraja + ", brojPeraja=" + brojPeraja
			+ "]";
}



public Ribe(String vrsta, String nazivZivotinje, String ishrana,boolean kicmenjak,  String mestoObitavanja, String vrstaPeraja,
		int brojPeraja) {
	super(vrsta, nazivZivotinje, ishrana, kicmenjak);
	this.mestoObitavanja = mestoObitavanja;
	this.vrstaPeraja = vrstaPeraja;
	this.brojPeraja = brojPeraja;
}  

public String getMestoObitavanja() {
	return mestoObitavanja;
}

public void setMestoObitavanja(String mestoObitavanja) {
	this.mestoObitavanja = mestoObitavanja;
}

public String getVrstaPeraja() {
	return vrstaPeraja;
}

public void setVrstaPeraja(String vrstaPeraja) {
	this.vrstaPeraja = vrstaPeraja;
}

public int getBrojPeraja() {
	return brojPeraja;
}

public void setBrojPeraja(int brojPeraja) {
	this.brojPeraja = brojPeraja;
}
 
	
}
