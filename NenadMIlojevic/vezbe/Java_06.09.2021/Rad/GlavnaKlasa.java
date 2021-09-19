package DomaciZoo;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vrsta zivotinja1 = new Vrsta("orao ribar","Pandion haliaetus ", "riba", true );
//		zivotinja1.stampajVrsta();
//		System.out.println("===============================");
		
		Ribe riba1 = new Ribe("Som","Silurus glanis","riba", true, "srednje duboke vode","zaobljena", 4);
//		riba1.stampanjeRibe();
//		System.out.println("===============================");
		
		Sisari sisar1 = new Sisari("Vidra"," Lutra lutra", "reke i jezera priobalje", true, "braon" , false);
//		sisar1.stampanjeSisari();
//		sisar1.setDomacaZiv(true);
//		sisar1.stampanjeSisari(); //posle promene iz divlja u domaca
//		System.out.println("===============================");
		
		Staniste staniste1 =new Staniste("Jezero");
		
		staniste1.setListaZivotinja(zivotinja1);
		staniste1.setListaZivotinja(riba1);
		staniste1.setListaZivotinja(sisar1);
		System.out.println(staniste1);
		
		
		
	}
		
		
}
