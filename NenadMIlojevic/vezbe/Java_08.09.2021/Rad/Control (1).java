package VideoPlejer;

public abstract class Control extends VideoPlayer{

	
	public Control(double duzinaVidea, double vremeVidea, double jacinaZvuka, int kvalitetVidea) {
		super(duzinaVidea, vremeVidea, jacinaZvuka, kvalitetVidea);
		// TODO Auto-generated constructor stub
	}

	public abstract void izvrsiAkicju(Object VideoPlayer);
}
