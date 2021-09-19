package Domaci1;

public class Autobus {
 private String nazivAutobusa; 
 private int cenaKarte; 
 private Putnik putnik1; 
 private Vozac vozac1; 
 
  
 @Override
public String toString() {
	return "Autobus [nazivAutobusa=" + nazivAutobusa + ", cenaKarte=" + cenaKarte + ", putnik1=" + putnik1 + ", vozac1="
			+ vozac1 + "]";
}
public Autobus(String nazivAutobusa, int cenaKarte) {
	super();
	this.nazivAutobusa = nazivAutobusa;
	this.cenaKarte = cenaKarte;
}
public void ukloniVozaca(Vozac vozac) {
	 if (this.vozac1 != null) {
		 this.vozac1 = null; 
		 
	 }}	 
 public void dodajVozaca(Vozac vozac) {
	if(this.vozac1 == null) {
		this.vozac1 = vozac;
	}}
 
public void ukloniPutnika(Putnik putnik) {
	if (this.putnik1 !=null) {
		this.putnik1 =null;
	}}

public void napraviPutnika(Putnik putnik) {
	if (this.putnik1 == null){
		this.putnik1 = putnik;
	}
}
}
