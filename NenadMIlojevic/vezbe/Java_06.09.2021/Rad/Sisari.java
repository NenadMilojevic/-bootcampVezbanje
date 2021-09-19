package DomaciZoo;

public class Sisari extends Vrsta{

	private String bojaDlake; 
	private String nacinIshrane;
	private boolean domacaZiv;
	
	public void stampanjeSisari() {
		System.out.println("Vrsta je: " +super.getVrsta() +
			 "\nNaziv je:" + super.getNazivZivotinje() +
			 "\nHrani se: " + super.getIshrana() +
			 super.stampanjeKic() + 
			 "\nBoja dlake: " + this.bojaDlake + 
			 "\nNacin Ishrane: " + this.nacinIshrane + 
			 "\nDomaca ziotinja: " + this.domacaZiv);
		
		
	}
	
	@Override
	public String toString() {
		return "Sisari [bojaDlake=" + bojaDlake + ", nacinIshrane=" + nacinIshrane + ", domacaZiv=" + domacaZiv + "]";
	}

	public Sisari(String vrsta, String nazivZivotinje, String ishrana, boolean kicemnjak, String bojaDlake, boolean domacaZiv) {
		super(vrsta, nazivZivotinje, ishrana, kicemnjak);
		this.bojaDlake = bojaDlake;
		this.domacaZiv = domacaZiv;
		this.nacinIshrane = super.getIshrana();
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getNacinIshrane() {
		return nacinIshrane;
	}

	public void setNacinIshrane(String nacinIshrane) {
		this.nacinIshrane = nacinIshrane;
	}

	public boolean isDomacaZiv() {
		return domacaZiv;
	}

	public void setDomacaZiv(boolean domacaZiv) {
		this.domacaZiv = domacaZiv;
	}
	
}
