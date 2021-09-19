package DomaciZoo;

import java.util.ArrayList;

public class Staniste  {
	public ArrayList<Vrsta> listaZivotinja = new ArrayList<Vrsta>();
	private String staniste;
	public Staniste() {
		
		// TODO Auto-generated constructor stub
	}

	
	public Staniste(String staniste) {
		super();
		this.staniste = staniste;
		this.listaZivotinja = listaZivotinja;
		
	}


	
	public void napraviZivotinju(Vrsta vrsta ) {
		
		this.listaZivotinja.add(vrsta);
	}
	

	@Override
	public String toString() {
		return "Staniste staniste=" + staniste + ", listaZivotinja=" + listaZivotinja + "]";
	}

	public void stampanjeStaniste() {
		System.out.println("staniste je: " + staniste);
		System.out.println("zivotinje koje zive u njemu su :" + "\n" + listaZivotinja.toString());
	}
	
	
	
	public ArrayList<Vrsta> getListaZivotinja() {
		return listaZivotinja;
	}

	public void setListaZivotinja(Vrsta zivotinja) {
		this.listaZivotinja.add(zivotinja);
	}


	public String getStaniste() {
		return staniste;
	}













	 
}
