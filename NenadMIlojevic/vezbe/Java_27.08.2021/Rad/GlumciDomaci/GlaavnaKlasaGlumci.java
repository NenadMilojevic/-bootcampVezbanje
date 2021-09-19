package GlumciDomaci;

public class GlaavnaKlasaGlumci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String imePrezime, int godinarodj, String pol,
		// boolean brak, double poFilmu, int brojFilmova

		Glumci glumci1 = new Glumci("Bred Pit", 1963, "Muski", false, 100, 20);
		glumci1.stampa();

		Glumci glumci2 = new Glumci();
		glumci2.imePrezime = "Natalie Portman";
		glumci2.godinaRodjenja = 1981;
		glumci2.pol = "zenski";
		glumci2.setuBraku(false);
		glumci2.setprosecnaZaradaPoFilmu(200);
		glumci2.setbrojFilmova(10);
		glumci2.stampa();
		
		Glumci listica = new Glumci();
		System.out.print(listica.lista());
	}
}
