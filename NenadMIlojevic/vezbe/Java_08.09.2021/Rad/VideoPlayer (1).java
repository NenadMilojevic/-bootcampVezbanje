package VideoPlejer;

public class VideoPlayer {
/*Kreirati klasu Video Player koja ima:
 duzinu videa
 trenutno vreme videa
 jacinu zvuka
 kvalitet videa (144, 240, 360, 480, 720, 1080)
 getere, setere i konstruktore
 metodu stampaj koja stampa podatke u formatu:
 trenutno vreme videa
 jacinu zvuka
 kvalitet videa
*/
	private double duzinaVidea; 
	private double vremeVidea; 
	private double jacinaZvuka; 
	private int kvalitetVidea; 
	
	public double getDuzinaVidea() {
		return duzinaVidea;
	}

	public void setDuzinaVidea(double duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}

	public double getVremeVidea() {
		return vremeVidea;
	}

	public void setVremeVidea(double vremeVidea) {
		this.vremeVidea = vremeVidea;
	}

	public double getJacinaZvuka() {
		return jacinaZvuka;
	}

	public void setJacinaZvuka(double jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}

	public int getKvalitetVidea() {
		return kvalitetVidea;
	}

	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}

	public VideoPlayer(double duzinaVidea, double vremeVidea, double jacinaZvuka, int kvalitetVidea) {
		super();
		this.duzinaVidea = duzinaVidea;
		this.vremeVidea = vremeVidea;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	}

	public void stampajV1() {
		System.out.println("trenutno vreme videa je: " + this.vremeVidea + 
							"\nJacina zvuka je: " + this.jacinaZvuka + 
							"\nKvalitet videa je: " + this.kvalitetVidea);
		
	}
	
}
