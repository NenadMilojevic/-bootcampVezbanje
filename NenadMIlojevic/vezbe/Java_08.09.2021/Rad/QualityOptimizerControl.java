package VideoPlejer;

public class QualityOptimizerControl extends Control  {
/*Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i ima brzinu interneta
 *  u megabitima npr 10mb/s 20mb/s... Getere, setere i konstruktore.
 *   Implementira metodu izvrsi akciju tako sto postavlja kvalitet videa 
 *   u zavisnosti od brzine interneta.
 Kvalitet se racuna na osnovu formule: brzina interneta * 10.1 gde se uzima prvi veci kvalitet
 ako je brzina 20 * 10.1 = 204 - postavlja 240;
 ako je brzina 5*10.1 = 50.5 - postavlja 144;
 ako je brzina 20*10.1 = 505 - postavlja 720;*/
	
	private double brzinaInterneta;

	
	
	
	@Override
	public void izvrsiAkicju(Object VideoPlayer) {
		// TODO Auto-generated method stub
//		 (144, 240, 360, 480, 720, 1080)
		
		if(this.brzinaInterneta>0  && (this.brzinaInterneta * 10.1)<=144 ) {
		super.setKvalitetVidea(144);
		}
		else if((this.brzinaInterneta) * 10.1 <=240) {
			super.setKvalitetVidea(240);
		}else if((this.brzinaInterneta) * 10.1 <= 360) {
			super.setKvalitetVidea(360);
		}else if((this.brzinaInterneta) * 10.1 <= 480) {
			super.setKvalitetVidea(480);
	    }else if((this.brzinaInterneta) * 10.1 <= 720) {
			super.setKvalitetVidea(720);
	    }else if((this.brzinaInterneta) * 10.1 > 720) {
			super.setKvalitetVidea(1080);}
		}

	public double getBrzinaInterneta() {
		return brzinaInterneta;
	}

	public void setBrzinaInterneta(double brzinaInterneta) {
		this.brzinaInterneta = brzinaInterneta;
	}

	public QualityOptimizerControl(double duzinaVidea, double vremeVidea, double jacinaZvuka, int kvalitetVidea,
			int brzinaInterneta) {
		super(duzinaVidea, vremeVidea, jacinaZvuka, kvalitetVidea);
		this.brzinaInterneta = brzinaInterneta;
	} 
	
	
	
	
	
	
}
