package VideoPlejer;

public class AudioControl extends Control {
private boolean povecanjeZvuka;

public boolean isPovecanjeZvuka() {
	return povecanjeZvuka;
}

public void setPovecanjeZvuka(boolean povecanjeZvuka) {
	this.povecanjeZvuka = povecanjeZvuka;
}

public AudioControl(double duzinaVidea, double vremeVidea, double jacinaZvuka, int kvalitetVidea,
		boolean povecanjeZvuka) {
	super(duzinaVidea, vremeVidea, jacinaZvuka, kvalitetVidea);
	this.povecanjeZvuka = povecanjeZvuka;
}

@Override
public void izvrsiAkicju(Object VideoPlayer) {
	// TODO Auto-generated method stub
	if(this.povecanjeZvuka) {
		if (super.getJacinaZvuka() <100) {
			super.setJacinaZvuka( super.getJacinaZvuka() + 1);
		}
	}
	else if(!this.povecanjeZvuka) {
		if(super.getJacinaZvuka()>0) {
			super.setDuzinaVidea(super.getJacinaZvuka() - 1);
		}
	}
} 

}
