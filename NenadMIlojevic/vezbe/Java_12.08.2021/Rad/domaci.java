package primer_01;
import java.util.Scanner;
public class domaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner sc = new Scanner(System.in);
	    double r =1;
		r=sc.nextDouble();
		if(r>0){
		System.out.println(r*r*3.14);
		}   else  {
		   System.out.println("Greska u unosu!");
	}
	sc.close();
	}

}
