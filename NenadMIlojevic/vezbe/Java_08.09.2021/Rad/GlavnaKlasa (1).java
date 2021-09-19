package VideoPlejer;

import java.util.ArrayList;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideoPlayer player1 = new VideoPlayer(1200, 200, 23, 720);
		player1.stampajV1();
		System.out.println("===================================");
		
		TimeControl ubrzanje = new TimeControl(1200, 200, 23, 720,false); 
		ubrzanje.izvrsiAkicju(player1);
		ubrzanje.stampajV1();
		System.out.println("===================================");
		
		AudioControl audioS = new AudioControl(1200, 200, 23, 720,true);
		audioS.izvrsiAkicju(player1);
		audioS.stampajV1();
		System.out.println("===================================");
		
		QualityOptimizerControl netPaket = new QualityOptimizerControl(1200, 200, 23, 720,150);
		netPaket.izvrsiAkicju(player1);
		netPaket.stampajV1();
		System.out.println("===================================");
		
		
		
		ArrayList<Control> listaAkcija = new ArrayList<>();
		listaAkcija.add(netPaket);
		listaAkcija.add(audioS);
		listaAkcija.add(ubrzanje);
		
		for(int i=0; i<listaAkcija.size(); i++) {
			listaAkcija.get(i).izvrsiAkicju(player1);
			
			player1.stampajV1();
			System.out.println("-----------------------");
		}
		
	}

}
