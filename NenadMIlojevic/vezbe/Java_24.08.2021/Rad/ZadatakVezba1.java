package dan_1_domaci;
import java.util.Scanner;
public class ZadatakVezba1 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 
		Scanner skener = new Scanner(System.in);
		double cenaUkupna =0; 
		double cenaNaplata = 0; 
		boolean brojac = true;
 while(brojac){
	 
	 System.out.println("unestite \n    0- Izlaz iz programa (zatvaranje kase)" + 
	 		"\n     1 - dodavanje cene proizvoda na racun " + 
	 		"\n		2 - naplata racuna");
	  switch(skener.nextInt()) {
	  case 0:{
		  System.out.println("Kasa je zatvorena");
		  brojac= false;
		  break;
	          }
	  case 1: {
		  System.out.println("unesite zeljenu cenu");
		  cenaUkupna +=skener.nextDouble();}
		  break; 
	  case 2: {
		  System.out.println("unesite kolicinu novca");
		  cenaNaplata = skener.nextDouble();
		  if(cenaNaplata<cenaUkupna) {
			  System.out.println("greska imate manje novca ");
			  break; 
			  
		  }else if(cenaNaplata>=cenaUkupna) {
			  double kusur=cenaNaplata - cenaUkupna;
			 System.out.println("Vas kusur je:  " + kusur);
			 cenaUkupna =0; 
			 break; 
		  }
		  }
		  
		  
	  }    
	  }
	  
	  
	  
  
	}

}