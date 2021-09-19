package DomaciZoo;

public class Vrsta {
 private String vrsta; 
 private String nazivZivotinje; 
 private String ishrana;
 private boolean kicmenjak; 
public Vrsta(String vrsta, String nazivZivotinje, String ishrana, boolean kicmenjak) {
	super();
	this.kicmenjak = kicmenjak;
	this.vrsta = vrsta;
	this.nazivZivotinje = nazivZivotinje;
	this.ishrana = ishrana;
}

@Override
public String toString() {
	return "Vrsta [vrsta=" + vrsta + ", nazivZivotinje=" + nazivZivotinje + ", ishrana=" + ishrana + ", kicmenjak="
			+ kicmenjak + "]";
}

public String stampanjeKic() {
	if(this.kicmenjak) {return "\n pripada kicmenjacima";}
	else {return"\n pripada beskicmenjacima";}
}
public boolean isKicmenjak() {
	return kicmenjak;
}

public void setKicmenjak(boolean kicmenjak) {
	this.kicmenjak = kicmenjak;
}

public String getVrsta() {
	return vrsta;
}

public void setVrsta(String vrsta) {
	this.vrsta = vrsta;
}

public String getNazivZivotinje() {
	return nazivZivotinje;
}

public void setNazivZivotinje(String nazivZivotinje) {
	this.nazivZivotinje = nazivZivotinje;
}

public String getIshrana() {
	return ishrana;
}

public void setIshrana(String ishrana) {
	this.ishrana = ishrana;
} 
  public void stampajVrsta() {
	  System.out.println("Vrsta je: " + this.vrsta +
			  			 "\nNaziv je:" + this.nazivZivotinje +
			  			 "\nHrani se: " + this.ishrana + 
			  			 this.stampanjeKic());
  }
 
}
