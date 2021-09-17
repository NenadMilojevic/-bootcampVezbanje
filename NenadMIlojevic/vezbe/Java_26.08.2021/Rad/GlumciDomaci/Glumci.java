package GlumciDomaci;

import java.util.ArrayList;
import java.util.Scanner;

public class Glumci {

	public String imePrezime;
	public int godinaRodjenja;
	public String pol;

	private boolean uBraku;
	private double prosecnaZaradaPoFilmu;
	private double brojFilmova;

	// konstruktori:
	public Glumci() {
	}

	public Glumci(String imePrezime, int godinarodj, String pol, boolean brak, double poFilmu, double brojFilmova) {
		this.imePrezime = imePrezime;
		this.godinaRodjenja = godinarodj;
		this.pol = pol;
		this.uBraku = brak;
		this.prosecnaZaradaPoFilmu = poFilmu;
		this.brojFilmova = brojFilmova;

	}

	// geteri i seteri za prvi privatni / da li su u braku
	public void setuBraku(boolean Brak) {
		this.uBraku = Brak;
	}

	public boolean getuBraku() {
		return this.uBraku;
	}

	// geteri i seteri za drugi privatni zarada po filmu
	public void setprosecnaZaradaPoFilmu(double zaradaFilm) {
		this.prosecnaZaradaPoFilmu = zaradaFilm;
	}

	public double getZaradaPoFilmu() {
		return this.prosecnaZaradaPoFilmu;
	}
	// geteri i seteri za treci privatni brojFilmova

	public void setbrojFilmova(int brFilmova) {
		this.brojFilmova = brFilmova;
	}

	public double getbrojFilmova() {
		return this.brojFilmova;
	}

	// racun metodi ukupnaZarada, puneGodina u 2022, ako su m onda mr ako su zene
	// mrs
	public double ukupnaZarada() {
		double ukupnaZarada = this.brojFilmova * this.prosecnaZaradaPoFilmu;
		return ukupnaZarada;
	}

	public int godidnePune() {
		int godineP = 2022 - this.godinaRodjenja;
		return godineP;
	}

	public String polPrefiks() {
		String polPrefiks;
		if (this.pol.equalsIgnoreCase("muski")) {
			polPrefiks = "   Mr  ";
		} else if (this.pol.equalsIgnoreCase("zenski")) {
			polPrefiks = "   Mrs  ";
		} else {
			polPrefiks = "niste uneli pol u ispravno formatu";
		}
		return polPrefiks;
	}
	// stampa

	public void stampa() {
		System.out.println(
				"Ime i prezime glumca: " + polPrefiks() + this.imePrezime + "\n rodjen/a: " + this.godinaRodjenja
						+ "   trenutno ima: " + godidnePune() + "\n pol:  " + this.pol + "      u bracnom odnosu : "
						+ this.uBraku + "\n prosecna zarada po filmu: " + this.prosecnaZaradaPoFilmu
						+ "\n ukupno filmova: " + this.brojFilmova + " ukupna zarada: " + ukupnaZarada());
	}
	
	
	public ArrayList lista () {
		ArrayList lista = new ArrayList();
		lista.add("	Free Guy 7.6 ");
		lista.add("	The Suicide Squad 7.4 ");
		lista.add(" The Green Knight 6.7 ");
		lista.add(" The Witcher: Nightmare of the Wolf 7.5 ");
		lista.add(" Shershaah  8.8");
		
		Object film1 = new Object();
		film1 =lista.get(4);
		Object film2 = new Object();
		film2 = lista.get(0);
		Object film3 = new Object();
		film3 = lista.get(3);
		Object film4 = new Object();
		film4 = lista.get(1);
		Object film5 = new Object();
		film5 = lista.get(2);
		lista.set(0, film1);
		lista.set(1, film2);
		lista.set(2, film3);
		lista.set(3, film4);
		lista.set(4, film5);
		
		for(int i=0;i<5; i++) {
			
		System.out.println("film " + lista.get(i));
		
		}
		
		return lista; 
//		
//		Scanner skener =  new Scanner(System.in);
//		Scanner skener1 = new Scanner(System.in);
//		ArrayList lista = new ArrayList(); 
//		int i=10; 
//		while(i>0) {
//		if(i%2==0) {	System.out.println("unesite ime filma: ");
//			            lista.add(skener.nextLine());
//			}
//		
//		else if(i%2 ==1) {
//						System.out.println("Unesite rejting: ");
//						lista.add(skener1.nextDouble());
//						
//		}i--;
//		
			
//		}
		
		
		
		
		
	}
	
	
	
}
