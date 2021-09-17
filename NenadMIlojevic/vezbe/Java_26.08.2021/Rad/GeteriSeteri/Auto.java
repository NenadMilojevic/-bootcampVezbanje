package GeteriSeteri;

public class Auto {

	public String ime; 
	private int PredjeniKm; 
	
	public Auto() {
		
	}
	public void stampanje () {
		
		System.out.println("auto " + ime + " je pre presao: " + getPredjeniKm() + " km");
	}
	
	public void setPredjeniKm (int km ) {
		
		this.PredjeniKm = km; 
	}
	public int getPredjeniKm () {
		return this.PredjeniKm;
	}
	
}
