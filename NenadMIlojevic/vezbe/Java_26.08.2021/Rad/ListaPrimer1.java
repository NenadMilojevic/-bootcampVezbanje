package Primer1;

import java.util.ArrayList;

public class ListaPrimer1 {

	public static void main(String[] args) {
//		Zadatak 1:
//			Napraviti listu od 4 elementa ovim redom: Voli, 3, Ana, Milovana.
//			Potrebno je obrisati element i sortirati listu da na ispisu pise 
//			"Ana Voli Milovana"
//		
	
		
		
		 ArrayList lista = new ArrayList();
		 lista.add("Voli");
		 lista.add(3);
		 lista.add("Ana");
		 lista.add("Milovana");
		 lista.remove(1); // brize celi index i smanjuje listu 
		 Object zamena;
			zamena = lista.get(1);
			lista.set(1, lista.get(0));
			lista.set(0, zamena);
		 for(int i = 0; i<lista.size(); i++) {
			 
			System.out.println(i + " na indexu je :  " + lista.get(i));
			
			
			
			
		 }
	}
}
