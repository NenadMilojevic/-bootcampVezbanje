package VideoPlejer;

public class TimeControl extends Control {
public TimeControl(double duzinaVidea, double vremeVidea, double jacinaZvuka, int kvalitetVidea, boolean pomeriVreme) {
		super(duzinaVidea, vremeVidea, jacinaZvuka, kvalitetVidea);
		this.pomeriVreme = pomeriVreme; 
		// TODO Auto-generated constructor stub
	}

	//	Kreirati klasu TimeControl koja nasledjuje klasu Control i konstruktore,
//	ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean),
//	implementira metodu izvrsi akciju 
//	tako sto pomeri trenutno vreme videa za 15s unapred ili unazad u zavisnosti od atributa. 
//	Veoma je bitno da se ne izadje van granica videa.
	private boolean pomeriVreme;



public boolean isPomeriVreme() {
	return pomeriVreme;
}

public void setPomeriVreme(boolean pomeriVreme) {
	this.pomeriVreme = pomeriVreme;
}

@Override
public void izvrsiAkicju(Object VideoPlayer) {
	// TODO Auto-generated method stub
	if (this.pomeriVreme) {
		if((super.getDuzinaVidea() -super.getVremeVidea()) > 15) {
			super.setVremeVidea(super.getVremeVidea()+ 15);
		}
	}else {
		if(super.getVremeVidea() >= 15) {
			super.setVremeVidea(super.getVremeVidea()- 15);
		}
	}
	
} 
	
	
	
	
}
