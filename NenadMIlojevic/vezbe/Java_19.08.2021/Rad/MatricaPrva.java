package cetvrtak;

public class MatricaPrva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		for(int i = 0; i<10; i++) {
			System.out.println("");
			for (int a = 0; a<10; a++) {
				
				{System.out.print("*");}
			}
			
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("");

			for (int a = 0; a < 10; a++) {

				if (a <= i) {
					System.out.print("*");

				}

			}

		}
	}

}
