package NoviPaket;
import java.util.Scanner; 
public class SwitchDomaci {
 
	public static void main(String[] args){
		
//		TODO Napisati program gde kroz switch se unosi broj od 1 do 12 
//		i program ispisuje koji je to mesec u godini. 
//		Ako korisnik unese drugi broj treba da se ispise poruka 
//		"Potrebno je uneti broj od 1 do 12"
//		
	Scanner skener = new Scanner(System.in);
	
	System.out.println("unesite broj da biste videli koji je to mesec u godini od 1 do 12");
	
	int mesec = skener.nextInt(); 
	
	
	switch (mesec) { 
	
	 
	case 1:  {
		 System.out.println("broj 1 je januar");		 
             }break; 
    case 2:  {
              System.out.println("broj 2 je februar");       	       
	         }break; 
	case 3:  {
        System.out.println("broj 3 je mart");
	        }break; 
	case 4:  {
        System.out.println("broj 4 je april");
	        }break; 
	case 5:  {
        System.out.println("broj 5 je maj");
	        }break; 
	case 6:  {
        System.out.println("broj 6 je jun");
	        }break;         
	case 7:  {
        System.out.println("broj 7 je jul");
	        }break;         
	case 8:  {
        System.out.println("broj 8 je avgust");
	        }break; 
	case 9:  {
        System.out.println("broj 9 je septembar");
	        }break; 
	case 10:  {
        System.out.println("broj 10 je oktobar");
	        }break;         
	case 11:  {
        System.out.println("broj 11 je novembar");
	        }break; 
	case 12:  {
        System.out.println("broj 12 je decembar");
	        }break; 
	
	default: 
	{
		System.out.println(" greska u unosu \npotrebno je uneti broj od 1 do 12");
	}
	
	}
	
	}
	
	}
